package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberRepository;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

    @Test
    void configurationTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberServicee = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);
        MemberRepository repository = ac.getBean("memberRepository", MemberRepository.class);

        MemberRepository memberRepository = memberServicee.getMemberRepository();
        MemberRepository orderRepository = orderService.getMemberRepository();


        System.out.println("memberRepository -> " + memberRepository);
        System.out.println("orderRepository -> " + orderRepository);
        System.out.println("repository -> " + repository);

        Assertions.assertThat(memberServicee.getMemberRepository()).isSameAs(repository);
        Assertions.assertThat(orderService.getMemberRepository()).isSameAs(repository);
    }

    @Test
    void configurationDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        //AppConfig도 스프링 빈으로 등록된다.
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean = " + bean.getClass());
        //출력: bean = class hello.core.AppConfig$$SpringCGLIB$$0
    }
}
