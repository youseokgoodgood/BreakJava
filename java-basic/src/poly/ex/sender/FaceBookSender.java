package poly.ex.sender;

/**
 * packageName    : poly.ex.sender
 * fileName       : FaceBookSender
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다.");
    }
}
