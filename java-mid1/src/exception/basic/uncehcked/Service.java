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
* Unchecked 예외는
* 예외를 잡거나, 던지지 않아도 된다.
* 예외를 잡지 않으면 자동으로 밖으로 던진다.
* */
public class Service {
   Client client = new Client();

   //예외를 잡아서 처리하는 코드
    public void callCatch(){
        try {
            client.call();
        } catch (MyUncheckedException e) {
            //예외 처리 로직
            System.out.println("예외처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /*
    * 예외를 잡지 않아도 되며, 자연스럽게 상위로 넘어간다.
    * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
    * */
    public void catchThrow() {
        client.call();
    }
}
