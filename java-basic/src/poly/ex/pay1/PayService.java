package poly.ex.pay1;

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

        System.out.println("결제를 시작합니다: option="+option + ", amount="+amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("결제가 성공 했습니다.");
        }else {
            System.out.println("결제가 실패 했습니다.");
        }

    }
}
