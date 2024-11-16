package com.example.hello.servlet.web.springmvc.v2;

import com.example.hello.servlet.domain.member.Member;
import com.example.hello.servlet.domain.member.MemberRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * packageName    : com.example.hello.servlet.web.springmvc.v2
 * fileName       : SpringMemberControllerV2
 * author         : wnsgh
 * date           : 2024-11-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-16        wnsgh       최초 생성
 */
@Controller
public class SpringMemberControllerV2 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();


    @RequestMapping("/springmvc/v2/members/new-form")
    public ModelAndView newForm() {
        return new ModelAndView("new-form");
    }

    @RequestMapping("/springmvc/v2/members/save")
    public ModelAndView save(HttpServletRequest req, HttpServletResponse res) {
        String username = req.getParameter("username");
        int age = Integer.parseInt(req.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelAndView modelAndView = new ModelAndView("save-result");
        modelAndView.addObject("member", member);
        return modelAndView;
    }

    @RequestMapping("/springmvc/v2/members")
    public ModelAndView members() {
        List<Member> members = memberRepository.findAll();

        ModelAndView modelAndView = new ModelAndView("members");
        modelAndView.addObject("members", members);
        return modelAndView;
    }

}
