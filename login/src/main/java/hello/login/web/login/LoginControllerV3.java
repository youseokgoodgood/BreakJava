package hello.login.web.login;

import hello.login.domain.login.LoginService;
import hello.login.domain.member.Member;
import hello.login.web.session.SessionConst;
import hello.login.web.session.SessionManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * packageName: hello.login.web.login
 * fileName: LoginController
 * author: 심유석
 * date: 2025-05-24
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-24        심유석       최초 생성
 */
@Slf4j
@Controller
@RequiredArgsConstructor
public class LoginControllerV3 {

    private final LoginService loginService;
    private final SessionManager sessionManager;

    @GetMapping("/login")
    public String loginForm(@ModelAttribute("loginForm") LoginForm loginForm) {
        return "login/loginForm";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult bindingResult, HttpServletResponse response, HttpServletRequest request) {
        if(bindingResult.hasErrors()) {
            return "login/loginForm";
        }

        Member loginMember = loginService.login(loginForm.getLoginId(), loginForm.getPassword());

        if(loginMember == null) {
            bindingResult.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "login/loginForm";
        }

        //로그인 성공 처리
        //세션이 있으면 있는 세션 반환, 없으면 신규 세션을 생성
        /*
        * request.getSession(true);
        *  -> 세션이 있으면 기존 세션을 반환
        *  -> 세션이 없으면 새로운 세션을 생성해서 반환
        * 
        * request.getSession(false);
        *  -> 세션이 있으면 기존 세션을 반환한다
        *  -> 세션이 없으면 새로운 세션을 생성하지 않으며, null을 반환
        * */
        HttpSession session = request.getSession();
        //세션에 로그인 회원 정보 보관
        session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);

        //세션 관리자를 통하여 세션을 생성하고, 회원 데이터를 보관

        log.info("loginMember={}", loginMember);
        log.info("sessionId={}", response.getHeader("Set-Cookie"));


        //세션 생성 후 로그인 성공시, 로그인한 회원의 정보를 보관하여 로그인 성공 후 메인 페이지로 이동
        return "redirect:/";

    }

    @PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);

        if(session != null) {
            session.invalidate(); //세션 초기화
        }


        return "redirect:/";
    }
}
