package com.example.hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v4
 * fileName       : ControllerV4
 * author         : wnsgh
 * date           : 2024-11-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-03        wnsgh       최초 생성
 */
public interface ControllerV4 {
    /**
     *
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String,String> paramMap ,Map<String, Object> model);

}
