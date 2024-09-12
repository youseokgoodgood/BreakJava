package poly.ex.pay1;

/**
 * packageName    : poly.ex.pay1
 * fileName       : NewPay
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class NewPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("NewPay 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
