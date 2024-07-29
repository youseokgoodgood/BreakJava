package hello.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
//public class NetworkClient implements InitializingBean, DisposableBean 인터페이스를 이용한 초기화 및 소멸
public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자를 호출, url = "+ url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작 시 호출
    public void connect(){
        System.out.println("connect: "+ url);
    }

    public void call(String message){
        System.out.println("call: "+ url + " message = " + message);
    }

    //서비스 종료 시 호출
    public void disconnect(){
        System.out.println("close: " + url);
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        connect();
//        call("초기화 연결 메시지");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        disconnect();
//    }


    @PostConstruct //어노테이션을 이용한 초기화
    public void init() {
        System.out.println("init");
        connect();
        call("초기화 연결 메시지");
    }


    @PreDestroy
    public void close() {
        System.out.println("close");
        disconnect();
    }
}
