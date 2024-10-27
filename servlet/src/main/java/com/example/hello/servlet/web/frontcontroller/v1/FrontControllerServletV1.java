package com.example.hello.servlet.web.frontcontroller.v1;

import com.example.hello.servlet.web.frontcontroller.v1.controller.MemberFormControllerV1;
import com.example.hello.servlet.web.frontcontroller.v1.controller.MemberListControllerV1;
import com.example.hello.servlet.web.frontcontroller.v1.controller.MemberSaveControllerV1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.frontcontroller.v1
 * fileName       : FrontControllerServletV1
 * author         : wnsgh
 * date           : 2024-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-27        wnsgh       최초 생성
 */
@WebServlet(name = "frontControllerServletV1", urlPatterns = "/front-controller/v1/*")
public class FrontControllerServletV1 extends HttpServlet {

    private final Map<String,ControllerV1> controllerV1Map = new HashMap<>();

    public FrontControllerServletV1() {
        controllerV1Map.put("/front-controller/v1/members/new-form",new MemberFormControllerV1());
        controllerV1Map.put("/front-controller/v1/members/save",new MemberSaveControllerV1());
        controllerV1Map.put("/front-controller/v1/members",new MemberListControllerV1());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FrontControllerServletV1.service");

        //프론트 컨트롤러를 통해 들어온 URI 정보를 확인 할 수 있음
        String requestURI = req.getRequestURI();

        ControllerV1 controller = controllerV1Map.get(requestURI);

        if(controller == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        controller.process(req,resp);
    }
}
