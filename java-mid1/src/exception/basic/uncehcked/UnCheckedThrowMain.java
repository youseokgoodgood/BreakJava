package exception.basic.uncehcked;

/**
 * author         : SYS
 * date           : 2025-02-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-01        SYS       최초 생성
 */
public class UnCheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}
