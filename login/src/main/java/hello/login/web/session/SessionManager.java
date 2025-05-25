package hello.login.web.session;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * packageName: hello.login.web.session
 * fileName: SessionManager
 * author: 심유석
 * date: 2025-05-25
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-25 심유석 최초 생성
 */

/*
 * 세션관리
 *
 * */
@Component
public class SessionManager {

    public static final String SESSION_COOKIE_NAME = "MySessionId";
    private Map<String, Object> sessionStore = new ConcurrentHashMap<>(); //동시성 일 경우 ConcurrentHashMap 사용

    /*
    * 세션 생성
    *
    * sessionId 생성 (임의에 추정 불가능한 랜덤값)
    * 세션 저장소에 sessionId와 보관할 값 저장
    * sessionId로 응답 쿠키를 생성해서 클라이언트에 전달
    *
    * */

    public void createSession(Object value, HttpServletResponse response) {
        //sessionId 생성 (임의에 추정 불가능한 랜덤값)
        //세션 id를 생성하고, 값에 세션에 저장
        String sessionId = UUID.randomUUID().toString();
        sessionStore.put(sessionId, value);

        //쿠키생성
        Cookie mySessionCookie = new Cookie(SESSION_COOKIE_NAME, sessionId);
        response.addCookie(mySessionCookie);
    }

    /*
    * 세션 조회
    *
    * */

    public Object getSession(HttpServletRequest request) {
        Cookie sessionCookie = findCookie(request, SESSION_COOKIE_NAME);

        if(sessionCookie == null) {
            return null;
        }
        //sessionId로 세션값 조회
        return sessionStore.get(sessionCookie.getValue());
    }
    
    /*
    * 세션 만료
    * */
    public void expireSession(HttpServletRequest request) {
        Cookie sessionCookie = findCookie(request, SESSION_COOKIE_NAME);

        if(sessionCookie != null) {
            sessionStore.remove(sessionCookie.getValue());
        }
    }

    public Cookie findCookie(HttpServletRequest request, String cookieName) {
        if(request.getCookies() == null) {
            return null;
        }

       return Arrays.stream(request.getCookies())
                .filter(cookie -> cookieName.equals(cookie.getName()))
                .findFirst()
                .orElse(null);
    }


}
