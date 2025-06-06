package com.example.hello.servlet.web.frontcontroller.v1.controller;

import com.example.hello.servlet.web.frontcontroller.v1.ControllerV1;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v1.controller
 * fileName       : MemberFormControllerV1
 * author         : wnsgh
 * date           : 2024-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-27        wnsgh       최초 생성
 */
public class MemberFormControllerV1 implements ControllerV1 {

    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        req.getRequestDispatcher(viewPath).forward(req, resp);// controller -> view 이동 시 사용

        /*
         * redirect는 forword랑 똑같은 거 아닌가?
         *
         * 리다이렉트는 실제 클라이언트에 응답이 나갔다가, 클라이언트가 redirect 경로로 다시 요청 하기 때문에
         * 클라이언트가 인지 할 수 있고, URL 경로도 실제로 변경됨
         *
         * forword 경우 서버 내부에서 일어나는 호출이기 때문에 클라이언트가 인지하지 못한다.
         *
         * */
    }
}
