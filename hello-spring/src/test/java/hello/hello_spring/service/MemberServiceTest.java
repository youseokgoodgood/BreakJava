package hello.hello_spring.service;

import hello.hello_spring.domain.Member;
import hello.hello_spring.repositroy.MemoryMemberRepositroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService;
    MemoryMemberRepositroy memberRepositroy;


    @BeforeEach
    public void beforeEach(){
        memberRepositroy = new MemoryMemberRepositroy();
        memberService = new MemberService(memberRepositroy);
    }

    @AfterEach
    public void afterEach(){
        memberRepositroy.clearStore();
    }

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("spring1");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복_회원_예외(){
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");
        //when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");


        //than
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}