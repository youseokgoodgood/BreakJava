package hello.login.web.session;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * packageName: hello.login.web.session
 * fileName: SessionInfoController
 * author: 심유석
 * date: 2025-05-26
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-26 심유석 최초 생성
 */

@Slf4j
@RestController
public class SessionInfoController {

    @GetMapping("/session-info")
    public String sessionInfo(HttpServletRequest request) {
        //세션 정보 출력
        HttpSession session = request.getSession(false);
        if(session != null) {
            return "세션이 없습니다";
        }

        session.getAttributeNames().asIterator().forEachRemaining(name -> {
            log.info("name={}", name);
            log.info("value={}", session.getAttribute(name));
            log.info("=========================");
        });
        
        log.info("session.getId={}", session.getId());
        log.info("session.getCreationTime={}", new Date(session.getCreationTime()));
        log.info("session.getLastAccessedTime={}", new Date(session.getLastAccessedTime()));
        log.info("session.getMaxInactiveInterval={}", session.getMaxInactiveInterval());
        log.info("session.isNew={}", session.isNew());

        return "세션 출력";
    }
}
