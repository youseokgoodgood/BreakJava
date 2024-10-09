package com.example.hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.basic.response
 * fileName       : ResponseHeaderServlet
 * author         : wnsgh
 * date           : 2024-10-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-09        wnsgh       최초 생성
 */
@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //[stats-line]
        resp.setStatus(HttpServletResponse.SC_OK);

        //[response-headers]
        responseHeaders(resp);

        //[Header 편의 메서드]
        content(resp);

        //Cookie
        cookies(resp);

        //redirect
        redirects(resp);

        resp.getWriter().write("ok");

    }

    private void redirects(HttpServletResponse resp) throws IOException {
        //Status Code 302
        //resp.setStatus(HttpServletResponse.SC_FOUND);
        resp.sendRedirect("basic/hello-form.html");
    }

    private void cookies(HttpServletResponse resp) {
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600);
        resp.addCookie(cookie);
    }

    private void content(HttpServletResponse resp) {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
    }

    private void responseHeaders(HttpServletResponse resp) {
        resp.setHeader("Content-Type", "text/html");
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // 캐쉬 무효화
        resp.setHeader("Pragma", "no-cache"); //과거버전 캐쉬 무효화
        resp.setHeader("my-header","helloworld");
    }
}
