package com.example.hello.servlet.web.frontcontroller.v3;

import com.example.hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v3
 * fileName       : ControllerV3
 * author         : wnsgh
 * date           : 2024-11-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-03        wnsgh       최초 생성
 */
public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
