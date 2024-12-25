package enumeration.test.ex1;

/**
 * author         : SYS
 * date           : 2024-12-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-25        SYS       최초 생성
 */
public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("grade= "+value.name() + ", level= "+value.getLevel()+", 설명= "+value.getDescription());
        }
    }
}
