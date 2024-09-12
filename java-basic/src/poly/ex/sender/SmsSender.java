package poly.ex.sender;

/**
 * packageName    : poly.ex.sender
 * fileName       : SmsSender
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다.");
    }
}
