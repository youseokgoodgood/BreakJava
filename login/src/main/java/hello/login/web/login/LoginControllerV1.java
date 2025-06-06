package hello.login.web.login;

import hello.login.domain.login.LoginService;
import hello.login.domain.member.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.Cookie;
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
public class LoginControllerV1 {

    private final LoginService loginService;

    //@GetMapping("/login")
    public String loginForm(@ModelAttribute("loginForm") LoginForm loginForm) {
        return "login/loginForm";
    }

    //@PostMapping("/login")
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

        //쿠키에 시간 정보를 주지 않으면 세션 쿠키(브라우저 종료시 모두 종료)
        Cookie loginMemberId = new Cookie("loginMemberId", String.valueOf(loginMember.getId()));
        response.addCookie(loginMemberId);

        return "redirect:/";

    }

    //@PostMapping("/logout")
    public String logout(HttpServletResponse response) {
        expireCookie(response);

        return "redirect:/";
    }

    private static void expireCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("loginMemberId", null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
