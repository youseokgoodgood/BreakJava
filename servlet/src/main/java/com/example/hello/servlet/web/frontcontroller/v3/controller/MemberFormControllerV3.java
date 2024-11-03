package com.example.hello.servlet.web.frontcontroller.v3.controller;

import com.example.hello.servlet.web.frontcontroller.ModelView;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v3.controller
 * fileName       : MemberFormControllerV3
 * author         : wnsgh
 * date           : 2024-11-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-03        wnsgh       최초 생성
 */
public class MemberFormControllerV3 implements ControllerV3 {


    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
