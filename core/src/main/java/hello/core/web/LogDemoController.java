package hello.core.web;

import hello.core.common.MyLogger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName    : hello.core.web
 * fileName       : LogDemoController
 * author         : wnsgh
 * date           : 2024-08-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-11        wnsgh       최초 생성
 */

/**
 * 초기 실행 시 에러발생(Error creating bean with name 'myLogger': Scope 'request' is not active for the current thread;)
 * - MyLogger 클래스 scope 경우 request임. 그래서 http request가 발생해야지 생성자 주입이 진행될 수 있음.
 * */

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;

    @RequestMapping("log-demo")
    @ResponseBody
    //HttpServletRequest를 통해 고객요청정보를 받을 수 있음
    public String logDemo(HttpServletRequest request) {
        String requestURL = request.getRequestURL().toString();
        myLogger.setRequestURL(requestURL);

        myLogger.log("controller test");
        logDemoService.logic("testId");
        return "ok";
    }


}
