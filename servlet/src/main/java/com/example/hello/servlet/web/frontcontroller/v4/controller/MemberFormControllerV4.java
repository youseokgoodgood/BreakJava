package com.example.hello.servlet.web.frontcontroller.v4.controller;

import com.example.hello.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v4.controller
 * fileName       : MemberFormControllerV4
 * author         : wnsgh
 * date           : 2024-11-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-03        wnsgh       최초 생성
 */
public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
