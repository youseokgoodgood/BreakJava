package enumeration.test.ex1;

import java.util.Scanner;

/**
 * author         : SYS
 * date           : 2024-12-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-25        SYS       최초 생성
 */
public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 등급을 입력하세요. [GUEST,LOGIN, ADMIN]: ");
        String guest = scanner.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(guest);
        System.out.println("당신의 등급은 "+ authGrade.getDescription() + "입니다.");

        System.out.println("==메뉴 목록==");

        switch (authGrade.getLevel()) {
            case 0:
                System.out.println("- 메인화면");
                break;
            case 1:
                System.out.println("- 이메일 관리 화면");
                break;
            case 2,3:
                System.out.println("- 관리자화면");
                break;
            default:
                System.out.println("당신의 등급을 찾을 수 없습니다.");
                new IllegalAccessException().printStackTrace();
                break;
        }
    }
}
