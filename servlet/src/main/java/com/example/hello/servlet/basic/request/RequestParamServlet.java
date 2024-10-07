package com.example.hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.basic.request
 * fileName       : RequestParamServlet
 * author         : wnsgh
 * date           : 2024-10-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-07        wnsgh       최초 생성
 */

/**
 * 1. 파라미터 전송
 * http://localhost:4000/request-param?username=hello&age=20
 *
 * */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회] - start");

        req.getParameterNames().asIterator().forEachRemaining(paramName -> System.out.println("paramName = " + req.getParameter(paramName)));

        System.out.println("[전체 파라미터 조회] - end");

        System.out.println("[단일 파라미터 조회]");
        String username = req.getParameter("username");
        System.out.println("username = " + username);

        String age = req.getParameter("age");
        System.out.println("age = " + age);

        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String[] usernames = req.getParameterValues("username");

        for (String name : usernames) {
            System.out.println("usernames = " + name);
        }

        resp.getWriter().write("ok");
    }
}
