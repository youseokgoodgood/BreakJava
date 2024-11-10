package com.example.hello.servlet.web.frontcontroller.v5;

import com.example.hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v5
 * fileName       : MyHeadlerAdapter
 * author         : wnsgh
 * date           : 2024-11-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-10        wnsgh       최초 생성
 */
public interface MyHandlerAdapter {

    boolean supports(Object handler);

    ModelView handle(HttpServletRequest req, HttpServletResponse resp,Object handler) throws ServletException, IOException;


}
