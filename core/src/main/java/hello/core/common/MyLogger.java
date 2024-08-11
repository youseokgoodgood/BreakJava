package hello.core.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * packageName    : hello.core.common
 * fileName       : MyLogger
 * author         : wnsgh
 * date           : 2024-08-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-11        wnsgh       최초 생성
 */



@Component
//@Scope(value = "request")
/*
 * 적용 대상이 인터페이스가 아닌 클래스면 TARGET_CLASS 를 선택
 * 적용 대상이 인터페이스면 INTERFACES 를 선택
 * 이렇게 하면 MyLogger의 가짜 프록시 클래스를 만들어두고 HTTP request와 상관 없이 가짜 프록시 클래스 다른 빈에 미리 주입해 둘 수 있다.
 * */
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)

public class MyLogger {

    private String uuid;
    @Setter
    private String requestURL;

    public void log(String message) {
        System.out.println("["+ uuid + "]" + "["+ requestURL +"]" + message);
    }

    @PostConstruct
    public void init() {
        uuid = UUID.randomUUID().toString();
        System.out.println("["+ uuid + "] request scope bean create: "+ this );
    }

    @PreDestroy
    public void close() {
        System.out.println("["+ uuid + "] request scope bean close: "+ this );
    }



}
