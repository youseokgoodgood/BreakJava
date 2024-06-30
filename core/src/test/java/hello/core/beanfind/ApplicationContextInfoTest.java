package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " object" + bean);
            /*
            * 위 bean 출력 시
            *
            * name = org.springframework.context.annotation.internalConfigurationAnnotationProcessor objectorg.springframework.context.annotation.ConfigurationClassPostProcessor@505a9d7c
              name = org.springframework.context.annotation.internalAutowiredAnnotationProcessor objectorg.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@758c83d8
              name = org.springframework.context.annotation.internalCommonAnnotationProcessor objectorg.springframework.context.annotation.CommonAnnotationBeanPostProcessor@129b4fe2
              name = org.springframework.context.event.internalEventListenerProcessor objectorg.springframework.context.event.EventListenerMethodProcessor@5af3a0f
              name = org.springframework.context.event.internalEventListenerFactory objectorg.springframework.context.event.DefaultEventListenerFactory@19ae6bb
            *  -> 스프링이 내부적으로 스프링 자체를 확장하기 위해서 사용하는 빈 목록
            *
            * name = appConfig objecthello.core.AppConfig$$SpringCGLIB$$0@10993713
              name = memberService objecthello.core.member.MemberServiceImpl@58359ebd
              name = memberRepository objecthello.core.member.MemoryMemberRepository@24b6b8f6
              name = orderService objecthello.core.order.OrderServiceImpl@72cf2de5
              name = discountPolicy objecthello.core.discount.RateDiscountPolicy@2bb7bd00
            * -> 내가 등록 한 스프링 빈 목록
            *
            * */
        }
    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean(){
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);// 빈 정보들을 확인가능

            //beanDefinition.ROLE_APPLICATION : 내부 뭔가를 하기위해서 등록한 빈들이 아닌 내가 이제 애플리케이션 주로 개발하기위해서 직접 등록한 빈 목록
            //beanDefinition.ROLE_INFRASTRUCTURE : 스프링이 내부에서 사용하는 빈
            if (beanDefinition.getRole() == beanDefinition.ROLE_APPLICATION) {
                Object bean = ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object" + bean);
            }
        }
    }
}
