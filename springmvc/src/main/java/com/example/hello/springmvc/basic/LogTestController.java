package com.example.hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * author         : SYS
 * date           : 2024-11-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-18        SYS       최초 생성
 */

@RestController
public class LogTestController {
    private static final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log-test")
    public ResponseEntity<String> logTest(){
        String name = "Spring";

        log.trace("trace = {}", name);
        log.info(" info log={}", name);

        return ResponseEntity.ok("OK");
    }


}
