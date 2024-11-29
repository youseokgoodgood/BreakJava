package enumeration.ex0;

import java.util.EnumSet;

/**
 * author         : SYS
 * date           : 2024-11-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-29        SYS       최초 생성
 */
public class DiscountService {

    public int discount(String grade, int price) {
        int discountPercent = 0;

        if(grade.equals("BASIC")){
            discountPercent = 10;
        } else if(grade.equals("GOLD")){
            discountPercent = 20;
        }else if(grade.equals("DIAMOND")){
            discountPercent = 30;
        }else {
            System.out.println(grade + ": 할인 x");
        }

        return (price * discountPercent)/100;
    }



}
