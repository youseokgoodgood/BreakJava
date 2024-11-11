package com.example.seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

/**
 * packageName    : com.example.seleniumexample
 * fileName       : SeleniumExample
 * author         : wnsgh
 * date           : 2024-09-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-24        wnsgh       최초 생성
 */
public class SeleniumExample {
    public static void SeleniumStart() {
        // Geckodriver 경로 설정 (시스템 경로에 있을 경우 생략 가능)
        //System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        System.setProperty("webdriver.gecko.driver", "D:\\inflearn\\SpringBoot\\Project\\BreakJava\\SeleniumExample\\geckodriver.exe");

        // Firefox 옵션 설정 (headless 모드)
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-headless");  // GUI 없는 서버에서 실행 시 필요
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // 파이어폭스 드라이버 생성
        WebDriver driver = new FirefoxDriver(options);

        // 웹사이트로 이동
        driver.get("https://finance.naver.com/world/sise.naver?symbol=DJI@DJI");

        // 페이지 제목 출력
        System.out.println("Page title is: " + driver.getTitle());
        //System.out.println("getFilesCnt = " + String.valueOf(getFilesCnt()));
        // 브라우저 종료
        driver.quit();
    }

    private static int getFilesCnt() {
        // 확인할 디렉토리 경로 (예: "/path/to/directory")
        String directoryPath = "/data";  // 원하는 경로로 변경

        // 해당 경로의 디렉토리 객체 생성
        File dir = new File(directoryPath);

        // 디렉토리가 존재하고 실제 디렉토리인 경우에만 파일 개수 확인
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files != null) {
                int fileCount = 0;

                // 파일만 카운트 (디렉토리는 제외)
                for (File file : files) {
                    if (file.isFile()) {
                        fileCount++;
                    }
                }

               return fileCount;
            } else {
                System.out.println("디렉토리 정보를 가져오지 못했습니다.");
                return 0;
            }
        } else {
            System.out.println("지정된 경로가 유효하지 않거나 디렉토리가 아닙니다.");
            return 0;
        }
    }
}
