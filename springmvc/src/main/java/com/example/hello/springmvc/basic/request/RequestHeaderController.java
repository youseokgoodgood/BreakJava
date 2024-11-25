package com.example.hello.springmvc.basic.request;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * author         : SYS
 * date           : 2024-11-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-25        SYS       최초 생성
 */
@Slf4j
@RestController
public class RequestHeaderController {

    @RequestMapping("/headers")
    public String headers(
            HttpServletRequest request,
            HttpServletResponse response,
            HttpMethod method,
            Locale locale,
            @RequestHeader MultiValueMap<String, String> headers,
            @RequestHeader("host") String host,
            @CookieValue(value = "myCookie", required = false) String cookieValue
    ) {
        log.info("request: {}", request);
        log.info("response: {}", response);
        log.info("HttpMethod: {}", method);
        log.info("Locale: {}", locale);
        log.info("headers: {}", headers);
        log.info("host: {}", host);
        log.info("cookieValue: {}", cookieValue);

        return "ok";
    }
}
