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
public class Client {

    public void call() throws MyUncheckedException {
        throw new MyUncheckedException("ex");
    }
}
