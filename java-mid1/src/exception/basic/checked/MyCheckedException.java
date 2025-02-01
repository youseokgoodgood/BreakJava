package exception.basic.checked;

/**
 * author         : SYS
 * date           : 2025-02-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-02-01        SYS       최초 생성
 * <p>
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {

    public MyCheckedException(String message) {
        super(message);
    }
}
