package com.example.hello.servlet.web.frontcontroller.v3.controller;

import com.example.hello.servlet.domain.member.Member;
import com.example.hello.servlet.domain.member.MemberRepository;
import com.example.hello.servlet.web.frontcontroller.ModelView;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v3.controller
 * fileName       : MemberSaveControllerV3
 * author         : wnsgh
 * date           : 2024-11-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-03        wnsgh       최초 생성
 */
public class MemberSaveControllerV3 implements ControllerV3 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);

        memberRepository.save(member);

        ModelView modelView = new ModelView("save-result");
        modelView.getModel().put("member", member);
        return modelView;
    }
}
