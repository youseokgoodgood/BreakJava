package com.example.hello.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * author         : SYS
 * date           : 2024-11-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-20        SYS       최초 생성
 */

@RestController
public class MappingController {

    private final Logger log = LoggerFactory.getLogger(MappingController.class);

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBasic() {
        log.info("hello-basic");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mapping(@PathVariable("userId") String userId) {
        log.info("mapping {}", userId);
        return "ok";
    }

    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable("userId") String userId, @PathVariable("orderId") String orderId) {
        log.info("mappingPath userId={}, orderId={}", userId,orderId);
        return "ok";
    }
}
