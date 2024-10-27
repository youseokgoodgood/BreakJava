package com.example.hello.servlet.web.frontcontroller.v2.controller;

import com.example.hello.servlet.web.frontcontroller.MyView;
import com.example.hello.servlet.web.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v2.controller
 * fileName       : MemberFormControllerV2
 * author         : wnsgh
 * date           : 2024-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-27        wnsgh       최초 생성
 */
public class MemberFormControllerV2 implements ControllerV2 {
    @Override
    public MyView process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
