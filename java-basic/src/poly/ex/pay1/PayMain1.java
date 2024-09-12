package poly.ex.pay1;

/**
 * packageName    : poly.ex.pay0
 * fileName       : PayMain0
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //newPay 결제
        String payOption3 = "newPay";
        int amount3 = 18000;
        payService.processPay(payOption3, amount3);

        //잘못된 결제 수단 선택
        String payOption4 = "bad";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);
    }
}
