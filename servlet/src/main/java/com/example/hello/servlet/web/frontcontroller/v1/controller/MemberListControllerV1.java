package com.example.hello.servlet.web.frontcontroller.v1.controller;

import com.example.hello.servlet.domain.member.Member;
import com.example.hello.servlet.domain.member.MemberRepository;
import com.example.hello.servlet.web.frontcontroller.v1.ControllerV1;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v1.controller
 * fileName       : MemberListControllerV1
 * author         : wnsgh
 * date           : 2024-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-27        wnsgh       최초 생성
 */
public class MemberListControllerV1 implements ControllerV1 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Member> memberList = memberRepository.findAll();

        //Model(request는 내부 데이터 저장소)에 데이터를 보관한다.
        req.setAttribute("members", memberList);

        String viewPath = "/WEB-INF/views/members.jsp";
        req.getRequestDispatcher(viewPath).forward(req, resp);
    }
}
