package com.example.hello.servlet.web.frontcontroller.v2;

import com.example.hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v2
 * fileName       : ControllerV2
 * author         : wnsgh
 * date           : 2024-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-27        wnsgh       최초 생성
 */
public interface ControllerV2 {
    MyView process(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException;
}
