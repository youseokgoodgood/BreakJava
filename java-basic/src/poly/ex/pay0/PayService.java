package poly.ex.pay0;

/**
 * packageName    : poly.ex.pay0
 * fileName       : PayService
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class PayService {
    public void processPay(String option, int amount){
        boolean result;
        System.out.println("결제를 시작합니다: option="+option + ", amount="+amount);

        if(option.equals("kakao")){
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if(option.equals("naver")){
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else{
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if(result){
            System.out.println("결제가 성공 했습니다.");
        }else {
            System.out.println("결제가 실패 했습니다.");
        }
    }
}
