package com.example.hello.servlet.web.frontcontroller.v3.controller;

import com.example.hello.servlet.domain.member.Member;
import com.example.hello.servlet.domain.member.MemberRepository;
import com.example.hello.servlet.web.frontcontroller.ModelView;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v3.controller
 * fileName       : MemberListControllerV3
 * author         : wnsgh
 * date           : 2024-11-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-03        wnsgh       최초 생성
 */
public class MemberListControllerV3 implements ControllerV3 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> memberList = memberRepository.findAll();
        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members", memberList);
        return modelView;
    }
}
