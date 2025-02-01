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

/*
* RuntimeException을 상속받은 예외는 언체크 예외가 된다.
* */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message){
        super(message);
    }
}
