package hello.typeconveter.controller;

import hello.typeconveter.type.IpPort;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : hello.typeconveter.controller
 * fileName       : HelloController
 * author         : sim-yuoseok
 * date           : 2025-07-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-30        sim-yuoseok       최초 생성
 */
@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");//문자 타입 조회
        Integer intValue = Integer.valueOf(data); //숫자 타입으로 변경

        log.info("intValue:{}", intValue);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        log.info("intValue:{}", data);
        return "ok";
    }

    @GetMapping("ip-port")
    public String ipPort(@RequestParam IpPort ipPort) {
        log.info("ipPort ip:{}", ipPort.getIp());
        log.info("ipPort port:{}", ipPort.getPort());
        return "ok";

    }
}
