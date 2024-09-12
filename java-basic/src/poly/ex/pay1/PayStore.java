package poly.ex.pay1;

/**
 * packageName    : poly.ex.pay1
 * fileName       : PayStore
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public abstract class PayStore {

    //변하는 부분
    public static Pay findPay(String option){
        if(option.equals("kakao")){
            return new KakaoPay();
        } else if(option.equals("naver")){
            return new NaverPay();
        } else if(option.equals("newPay")){
            return new NewPay();
        } else{
            return new DefaultPay();
        }
    }
}
