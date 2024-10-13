package com.example.hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.example.hello.servlet.domain.member
 * fileName       : Member
 * author         : wnsgh
 * date           : 2024-10-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-13        wnsgh       최초 생성
 */
@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member() {
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
