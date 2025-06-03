package hello.login;

import hello.login.web.filter.LogCheckFilter;
import hello.login.web.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * packageName: hello.login
 * fileName: WebConfig
 * author: 심유석
 * date: 2025-06-02
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-06-02 심유석 최초 생성
 */
@Configuration
public class WebConfig {

    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>(); //필터 등록 객체 생성
        filterRegistrationBean.setFilter(new LogFilter()); //내가 만든 필터를 등록
        filterRegistrationBean.addUrlPatterns("/*"); //필터를 적용할 URL을 등록
        filterRegistrationBean.setName("logFilter"); //필터 이름을 등록
        filterRegistrationBean.setOrder(1); //필터 실행 순서를 등록

        return filterRegistrationBean; //필터 등록 객체 반환
    }

    @Bean
    public FilterRegistrationBean LogCheckFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>(); //필터 등록 객체 생성
        filterRegistrationBean.setFilter(new LogCheckFilter()); //내가 만든 필터를 등록
        filterRegistrationBean.addUrlPatterns("/*"); //필터를 적용할 URL을 등록
        filterRegistrationBean.setName("LogCheckFilter"); //필터 이름을 등록
        filterRegistrationBean.setOrder(2); //필터 실행 순서를 등록

        return filterRegistrationBean; //필터 등록 객체 반환
    }
}
