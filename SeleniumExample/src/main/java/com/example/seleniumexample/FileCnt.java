package com.example.seleniumexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
            getFilesCnt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void getFilesCnt() throws IOException {
        File dir = null;
        String formattedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        // 확인할 디렉토리 경로 (예: "/path/to/directory")
        String directoryPath = "C:\\Users\\wnsgh\\OneDrive\\사진\\Screenshots\\";  // 원하는 경로로 변경

        try {
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
                        if (file.isFile()) {
                            System.out.println("dir.getName() = " + file.getName()); //파일명
                            System.out.println("dir.getAbsolutePath() = " + file.getAbsolutePath()); //파일경로
                            System.out.println("dir.listFiles().length = " + file.length()); //파일 용량
                            fileCount++;
                        }
                    }

                    System.out.println("디렉토리 내 파일 개수: " + fileCount);
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
}
