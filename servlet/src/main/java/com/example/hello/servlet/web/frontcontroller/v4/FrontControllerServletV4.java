package com.example.hello.servlet.web.frontcontroller.v4;

import com.example.hello.servlet.web.frontcontroller.ModelView;
import com.example.hello.servlet.web.frontcontroller.MyView;
import com.example.hello.servlet.web.frontcontroller.v3.ControllerV3;
import com.example.hello.servlet.web.frontcontroller.v3.controller.MemberFormControllerV3;
import com.example.hello.servlet.web.frontcontroller.v3.controller.MemberListControllerV3;
import com.example.hello.servlet.web.frontcontroller.v3.controller.MemberSaveControllerV3;
import com.example.hello.servlet.web.frontcontroller.v4.controller.MemberFormControllerV4;
import com.example.hello.servlet.web.frontcontroller.v4.controller.MemberListControllerV4;
import com.example.hello.servlet.web.frontcontroller.v4.controller.MemberSaveControllerV4;
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
@WebServlet(name = "frontControllerServletV4", urlPatterns = "/front-controller/v4/*")
public class FrontControllerServletV4 extends HttpServlet {

    private final Map<String, ControllerV4> controllerMap = new HashMap<>();

    public FrontControllerServletV4() {
        controllerMap.put("/front-controller/v4/members/new-form",new MemberFormControllerV4());
        controllerMap.put("/front-controller/v4/members/save",new MemberSaveControllerV4());
        controllerMap.put("/front-controller/v4/members",new MemberListControllerV4());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //프론트 컨트롤러를 통해 들어온 URI 정보를 확인 할 수 있음
        String requestURI = req.getRequestURI();

        ControllerV4 controller = controllerMap.get(requestURI);

        if(controller == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        Map<String, String> paramMap = createParamMap(req);
        Map<String, Object> model = new HashMap<>();
        String viewName = controller.process(paramMap, model);
        MyView myView = viewResolver(viewName);

        myView.render(model ,req,resp);
    }

    private static MyView viewResolver(String viewName) {
        return new MyView("/WEB-INF/views/" + viewName + ".jsp");
    }

    private static Map<String, String> createParamMap(HttpServletRequest req) {
        Map<String,String> paramMap = new HashMap<>();
        req.getParameterNames().asIterator()
                        .forEachRemaining(paramName -> paramMap.put(paramName, req.getParameter(paramName)));
        return paramMap;
    }
}
