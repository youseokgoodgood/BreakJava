package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/*
* basePackages 미 설정 시, @ComponentScan이 붙은 설정정보 클래스의 패키지가 시작 위치가 된다.
* */

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", // 꼭 필요한 위치부터 탐색하도록 시작 위치를 지정, 탐색할 패키지의 시작 위치를 지정한다. 이 패키지를 포함해서 하위 패키지를 모두 탐색한다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
                classes = Configuration.class))//Configuration 붙은 어노테이션은 제외 후 검색
public class AutoAppConfig {
}
