package hello.login.web.filter;

import hello.login.web.session.SessionConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * packageName: hello.login.web.filter
 * fileName: LogCheckFilter
 * author: 심유석
 * date: 2025-06-03
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-06-03        심유석       최초 생성
 */
@Slf4j
public class LogCheckFilter implements Filter {

    private static final String[] whiteList = {"/","members/add","/login","/logout","/css/*","/favicon.ico"};

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String requestURI = httpServletRequest.getRequestURI();

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        try {
            log.info("인증 체크 필터 시작 {}",requestURI);

            if(isLoginCheckPath(requestURI)){ //로그인 여부 확인
                log.info("인증 체크 로직 실행 {}",requestURI);
                HttpSession session = httpServletRequest.getSession(false);
                if(session == null || session.getAttribute(SessionConst.LOGIN_MEMBER) == null){
                    log.info("미인증 사용자 요청 {}", requestURI);

                    //로그인으로 redirect
                    httpServletResponse.sendRedirect("/login?redirectURL=" + requestURI); //로그인 후 다시 원래 접속했던 페이지로 되돌아가기 위해 redirectURL=" + requestURI 설정
                    return;
                }
            }

            //인증 체크 성공시, 다음 필터로 넘어가기 전에 실행됨, 만약 필터가 없다면 Servlet 요청을 처리한다.
            chain.doFilter(request, response);
            log.info("인증 체크 필터 종료 {}",requestURI);

        }catch (Exception e){
           throw e;
        }

    }

    /*
    * 화이트 리스트의 경우 인증 체크x
    * */
    private boolean isLoginCheckPath(String requestURI){
        return !PatternMatchUtils.simpleMatch(whiteList,requestURI);
    }

}
