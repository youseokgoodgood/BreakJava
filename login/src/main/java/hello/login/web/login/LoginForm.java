package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName: hello.login.web.login
 * fileName: LoginForm
 * author: 심유석
 * date: 2025-05-24
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-24 심유석 최초 생성
 */
@Data
public class LoginForm {

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
