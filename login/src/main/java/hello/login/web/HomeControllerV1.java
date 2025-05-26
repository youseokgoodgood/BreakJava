package hello.login.web;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeControllerV1 {

    private final MemberRepository memberRepository;

    //@GetMapping("/")
    public String home() {
        return "home";
    }

    //@GetMapping("/")
    public String homeLogin(@CookieValue(value = "loginMemberId", required = false) Long loginMemberId, Model model) {
        if (loginMemberId == null) {
            return "home";
        }

        Member loginMember = memberRepository.findById(loginMemberId);

        if (loginMember == null) {
            return "home";
        }

        model.addAttribute("member", loginMember);

        return "loginHome";
    }
}