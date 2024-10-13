package com.example.hello.servlet.domain.member;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * packageName    : com.example.hello.servlet.domain.member
 * fileName       : MemberRepositoryTest
 * author         : wnsgh
 * date           : 2024-10-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-13        wnsgh       최초 생성
 */

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member("hello",20);

        //when
        Member saveMember = memberRepository.save(member);

        //than
        Member findMember = memberRepository.findById(saveMember.getId());
        assertThat(findMember).isEqualTo(saveMember);
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("hello", 20);
        Member member2 = new Member("world", 25);
        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> members = memberRepository.findAll();

        //than
        assertThat(members).hasSize(2);
        assertThat(members).contains(member1, member2);
    }

}