package poly.ex.sender;

/**
 * packageName    : poly.ex.sender
 * fileName       : EmailSender
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다.");
    }
}
