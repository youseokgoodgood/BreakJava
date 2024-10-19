package com.example.hello.servlet.web.servletmvc;

import com.example.hello.servlet.domain.member.Member;
import com.example.hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * packageName    : com.example.hello.servlet.web.servletmvc
 * fileName       : MvcMemberSaveServlet
 * author         : wnsgh
 * date           : 2024-10-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-19        wnsgh       최초 생성
 */
@WebServlet(name = "mvcMemberSaveServlet",urlPatterns = "servlet-mvc/members/save")
public class MvcMemberSaveServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        int age = Integer.parseInt(req.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);
        
        //Model(request는 내부 데이터 저장소)에 데이터를 보관한다.
        req.setAttribute("member", member);

        String viewPath = "WEB-INF/views/save-result.jsp";
        req.getRequestDispatcher(viewPath).forward(req, resp);
    }
}
