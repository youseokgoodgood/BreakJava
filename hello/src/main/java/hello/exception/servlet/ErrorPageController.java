package hello.exception.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * packageName    : hello.exception.servlet
 * fileName       : ErrorPageController
 * author         : sim-yuoseok
 * date           : 2025-07-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-12        sim-yuoseok       최초 생성
 */

@Slf4j
@Controller
public class ErrorPageController {

    @RequestMapping("error-page/404")
    public String error404(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.error("404 Not Found!!");
        return "error-page/404";
    }

    @RequestMapping("error-page/500")
    public String error500(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.error("error500");
        return "error-page/500";
    }

}

