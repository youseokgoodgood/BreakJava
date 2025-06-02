package hello.login.web.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.UUID;

/**
 * packageName: hello.login.web.filter
 * fileName: LogFilter
 * author: 심유석
 * date: 2025-06-02
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-06-02 심유석 최초 생성
 */
@Slf4j
public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("LogFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("LogFilter doFilter");

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        String uuid = UUID.randomUUID().toString();

        try {
            log.info("requestURI={}, uuid={}", requestURI, uuid);
            chain.doFilter(request, response); //다음 필터로 넘어가기 전에 실행됨, 만약 필터가 없다면 servlet에게 요청을 처리한다.
        }catch (Exception e) {
            throw e;
        }finally {

        }

    }

    @Override
    public void destroy() {
        log.info("LogFilter destroy");
    }
}
