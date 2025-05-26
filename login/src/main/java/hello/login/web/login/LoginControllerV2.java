package hello.login.web.login;

import hello.login.domain.login.LoginService;
import hello.login.domain.member.Member;
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
public class LoginControllerV2 {

    private final LoginService loginService;
    private final SessionManager sessionManager;

    //@GetMapping("/login")
    public String loginForm(@ModelAttribute("loginForm") LoginForm loginForm) {
        return "login/loginForm";
    }

   // @PostMapping("/login")
    public String login(@Valid @ModelAttribute("loginForm") LoginForm loginForm, BindingResult bindingResult, HttpServletResponse response) {
        if(bindingResult.hasErrors()) {
            return "login/loginForm";
        }

        Member loginMember = loginService.login(loginForm.getLoginId(), loginForm.getPassword());

        if(loginMember == null) {
            bindingResult.reject("loginFail", "아이디 또는 비밀번호가 맞지 않습니다.");
            return "login/loginForm";
        }

        //로그인 성공

        //세션 관리자를 통하여 세션을 생성하고, 회원 데이터를 보관
        sessionManager.createSession(loginMember, response);
        log.info("loginMember={}", loginMember);
        log.info("sessionId={}", response.getHeader("Set-Cookie"));


        //세션 생성 후 로그인 성공시, 로그인한 회원의 정보를 보관하여 로그인 성공 후 메인 페이지로 이동
        return "redirect:/";

    }

    //@PostMapping("/logout")
    public String logout(HttpServletRequest request) {
        //세션 관리자를 통하여 세션을 만료
        sessionManager.expireSession(request);

        //세션 만료 후 로그아웃 성공시, 로그아웃 후 메인 페이지로 이동
        return "redirect:/";
    }
}
