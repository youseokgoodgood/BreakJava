package hello.hello_spring.service;

import hello.hello_spring.repositroy.JdbcMemberRepository;
import hello.hello_spring.repositroy.JdbcTemplateMemberRepository;
import hello.hello_spring.repositroy.MemberRepository;
import hello.hello_spring.repositroy.MemoryMemberRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepositroy();
        //return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
