package com.example.seleniumexample;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;


/**
 * packageName    : io
 * fileName       : FileCnt
 * author         : wnsgh
 * date           : 2024-10-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-15        wnsgh       최초 생성
 */
public class FileCnt {
    private static final Logger logger = Logger.getLogger("MyLog");

    public static void main(String[] args) {

        try {
//            String str = "123";
//
//            System.out.println("str.isBlank() = " + str.isBlank());
//            System.out.println("str.isEmpty() = " + str.isEmpty());
//
//            String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
//
//            // 결과 출력
//            System.out.println("Formatted Date: " + formattedDate);
            //getFilesCnt();
            //insertDataFromJson();

            String testStr = "5011025022102760018_overlay_crop.png";

            String[] s = testStr.split("_", 0);
            System.out.println("s = " + s);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void getFilesCnt() throws IOException {
        File dir = null;
        String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        // 확인할 디렉토리 경로 (예: "/path/to/directory")
        String directoryPath = "C:\\Users\\wnsgh\\OneDrive\\사진\\Screenshots\\4717041029107460001_lx.png";  // 원하는 경로로 변경

        try {
            String[] s = directoryPath.split("", 0);
            System.out.println("s = " + s.toString());

            Path path = Paths.get(directoryPath,formattedDate,"2022","2");

            // 해당 경로의 디렉토리 객체 생성
            dir = new File(String.valueOf(path));

            if (!dir.exists()) {
                Files.createDirectories(path);
            }

//        System.out.println("dir.getName() = " + dir.getName()); //파일명
//        System.out.println("dir.getAbsolutePath() = " + dir.getAbsolutePath()); //파일경로
//        System.out.println("dir.listFiles().length = " + dir.length()); //파일 용량
            // 디렉토리가 존재하고 실제 디렉토리인 경우에만 파일 개수 확인
            if (dir.exists() && dir.isDirectory()) {
                File[] files = dir.listFiles();

                if (files != null) {
                    int fileCount = 0;

                    // 파일만 카운트 (디렉토리는 제외)
                    for (File file : files) {
                        if (file.isFile() && !file.getName().contains("txt")) {
                            System.out.println("dir.getName() = " + file.getName()); //파일명
                            System.out.println("dir.getAbsolutePath() = " + file.getAbsolutePath()); //파일경로
                            System.out.println("dir.listFiles().length = " + file.length()); //파일 용량
                            fileCount++;
                        }
                    }

                    System.out.println("디렉토리 내 파일 개수: " + fileCount);


                    System.out.println("getCnt: "+getCnt(path));

                } else {
                    System.out.println("디렉토리 정보를 가져오지 못했습니다.");
                }
            } else {
                System.out.println("지정된 경로가 유효하지 않거나 디렉토리가 아닙니다.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static long getCnt(Path dir) {
        try(Stream<Path> files = Files.list(dir)){
            long count = files.filter(Files::isRegularFile).
                    filter(file -> !file.toString().endsWith("txt")).count();

            System.out.println(count);
            return count;
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }

    private static DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        Properties properties = new Properties();

        try(InputStream inputStream = FileCnt.class.getClassLoader().getResourceAsStream("application.properties")) {
            if(inputStream == null){
                return driverManagerDataSource;
            }
            properties.load(inputStream);

            driverManagerDataSource.setDriverClassName(properties.getProperty("Globals.DriverClassName"));
            driverManagerDataSource.setUrl(properties.getProperty("Globals.Url"));
            driverManagerDataSource.setUsername(properties.getProperty("Globals.UserName"));
            driverManagerDataSource.setPassword(properties.getProperty("Globals.Password"));
        }catch (RuntimeException | IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        return driverManagerDataSource;
    }


    public static void insertDataFromJson() {
        String insertSql = "INSERT INTO \"GOLD_PL\".m_sv_frln_shape_anls_rslt_test\n" +
                "(anls_ymd, imgr_idntf_artcl_cd, biz_yr, agrclt_bizcd, biz_aply_sno, biz_aply_frln_sno, nplow_area, actl_plow_area, file_path_nm, photo_file_nm, anls_rslt_cn, rmrk_cn, str_dt, str_userid)\n" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        String jsonFilePath = "D:\\농정원\\본사업\\이행점검_GEO\\수집기\\분석\\2.1.3.4 Deeplab_3region_result_241011_v0.1.json";
        Timestamp localDate = getLocalDate();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // JSON 파일을 Java 객체로 매핑
            Map<String, List<Map<String, Object>>> jsonData = objectMapper.readValue(
                    new File(jsonFilePath),
                    new TypeReference<Map<String, List<Map<String, Object>>>>() {}
            );

            // JSON 루트 키 접근
            String rootKey = "2.1.3.4 Deeplab_3region_result_";
            List<Map<String, Object>> records = jsonData.get(rootKey);

            /**/
            for (Map<String, Object> record : records) {
                String anlsYmd = record.getOrDefault("ANLS_YMD", "2024-11-24").toString();
                System.out.println(anlsYmd);
                jdbcTemplate.update(insertSql,
                        record.getOrDefault("ANLS_YMD", "2024-11-24").toString(), // 정수형 변환
                        record.getOrDefault("IMGR_IDNTF_ARTCL_CD", "N/A").toString(), // 문자열 처리
                        record.getOrDefault("BIZ_YR", "0").toString(),
                        record.getOrDefault("AGRCLT_BIZCD", "N/A").toString(),
                        record.getOrDefault("BIZ_APLY_SNO", 0), // NULL 처리
                        record.getOrDefault("BIZ_APLY_FRLN_SNO", 0), // NULL 처리
                        record.getOrDefault("NPLOW_AREA", "0.0").toString(), // 부동소수점
                        record.getOrDefault("ACTL_PLOW_AREA", "0.0").toString(),
                        record.getOrDefault("FILE_PATH_NM", "./default/path/").toString(),
                        record.getOrDefault("PHOTO_FILE_NM", "default.png").toString(),
                        record.getOrDefault("ANLS_RSLT_CN", "0.0").toString(),
                        record.getOrDefault("RMRK_CN", "").toString(), // 비고 컬럼 기본값
                        "2024-11-24", // 적재일시
                        "GP" // 적재사용자ID
                );
            }

            System.out.println("Data inserted successfully.");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error reading or parsing JSON file: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Database operation failed: " + e.getMessage());
        }
    }

    private static Timestamp getLocalDate() {
        return Timestamp.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
