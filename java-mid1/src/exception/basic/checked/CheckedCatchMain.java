package exception.basic.checked;

/**
 * author         : SYS
 * date           : 2025-02-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-01        SYS       최초 생성
 */
public class CheckedCatchMain {
    public static void main(String[] args){
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
