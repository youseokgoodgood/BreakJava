package hello.login.domain.member;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;

/**
 * packageName    : hello.login.domain.member
 * fileName       : Member
 * author         : wnsgh
 * date           : 2025-05-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-22        wnsgh       최초 생성
 */

@Data
public class Member {
    private Long id;

    @NotEmpty
    private String loginId; //사용자 아이디
    @NotEmpty
    private String name; //사용자 이름
    @NotEmpty
    private String password;
}
