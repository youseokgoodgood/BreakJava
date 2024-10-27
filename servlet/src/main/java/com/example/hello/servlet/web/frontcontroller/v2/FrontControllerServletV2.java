package com.example.hello.servlet.web.frontcontroller.v2;

import com.example.hello.servlet.web.frontcontroller.v2.controller.MemberFormControllerV2;
import com.example.hello.servlet.web.frontcontroller.v2.controller.MemberListControllerV2;
import com.example.hello.servlet.web.frontcontroller.v2.controller.MemberSaveControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.example.hello.servlet.web.front controller.v1
 * fileName       : FrontControllerServletV1
 * author         : sim
 * date           : 2024-10-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-27        sim       최초 생성
 */
@WebServlet(name = "frontControllerServletV2", urlPatterns = "/front-controller/v2/*")
public class FrontControllerServletV2 extends HttpServlet {

    private final Map<String, ControllerV2> controllerV1Map = new HashMap<>();

    public FrontControllerServletV2() {
        controllerV1Map.put("/front-controller/v2/members/new-form",new MemberFormControllerV2());
        controllerV1Map.put("/front-controller/v2/members/save",new MemberSaveControllerV2());
        controllerV1Map.put("/front-controller/v2/members",new MemberListControllerV2());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //프론트 컨트롤러를 통해 들어온 URI 정보를 확인 할 수 있음
        String requestURI = req.getRequestURI();

        ControllerV2 controller = controllerV1Map.get(requestURI);

        if(controller == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        controller.process(req,resp);
    }
}
