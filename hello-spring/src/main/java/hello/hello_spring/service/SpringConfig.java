package hello.hello_spring.service;

import hello.hello_spring.repositroy.MemberRepository;
import hello.hello_spring.repositroy.MemoryMemberRepositroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepositroy();
    }
}
