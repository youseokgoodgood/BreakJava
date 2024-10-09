package com.example.hello.servlet.basic.response;

import com.example.hello.servlet.basic.HelloData;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.basic.response
 * fileName       : ResponseJsonServlet
 * author         : wnsgh
 * date           : 2024-10-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-09        wnsgh       최초 생성
 */
@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Content-Type: application/json
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        HelloData helloData = new HelloData();
        helloData.setUsername("sim");
        helloData.setAge(31);

        //{"username":"sim","age":31}
        String result = objectMapper.writeValueAsString(helloData);
        resp.getWriter().write(result);
    }
}
