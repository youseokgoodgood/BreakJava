package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repositroy.MemoryMemberRepositroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositroyTest {


    MemoryMemberRepositroy repositroy = new MemoryMemberRepositroy();

    @AfterEach
    public void afterEach(){
        repositroy.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repositroy.save(member);

        Member result =  repositroy.findById(member.getId()).get();

        System.out.println("result = "+ (result == member));

        //Assertions.assertEquals(member,result);
        assertThat(member).isEqualTo(result);

    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repositroy.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repositroy.save(member2);

        Member result = repositroy.findByName("spring1").get();

        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repositroy.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repositroy.save(member2);

        List<Member> result = repositroy.findAll();

        assertThat(result.size()).isEqualTo(2);
    }

}
