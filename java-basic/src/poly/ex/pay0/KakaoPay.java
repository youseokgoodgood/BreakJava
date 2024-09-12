package poly.ex.pay0;

/**
 * packageName    : poly.ex.pay0
 * fileName       : KakaoPay
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class KakaoPay {
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

}
