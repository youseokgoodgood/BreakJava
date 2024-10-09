package com.example.hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * packageName    : com.example.hello.servlet.basic.response
 * fileName       : ResponseHtmlServlet
 * author         : wnsgh
 * date           : 2024-10-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-09        wnsgh       최초 생성
 */

@WebServlet(name = "responseHtmlServlet", urlPatterns = "/response-html")
public class ResponseHtmlServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Content-Type: text/html;charset=utf-8
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ResponseHtmlServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>ResponseHtmlServlet</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
