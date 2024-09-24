package com.example.seleniumexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

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
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");

        // Firefox 옵션 설정 (headless 모드)
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-headless");  // GUI 없는 서버에서 실행 시 필요

        // 파이어폭스 드라이버 생성
        WebDriver driver = new FirefoxDriver(options);

        // 웹사이트로 이동
        driver.get("https://finance.naver.com/world/sise.naver?symbol=DJI@DJI");

        // 페이지 제목 출력
        System.out.println("Page title is: " + driver.getTitle());

        // 브라우저 종료
        driver.quit();
    }
}
