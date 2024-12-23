package enumeration.ref3;

/**
 * author         : SYS
 * date           : 2024-12-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-23        SYS       최초 생성
 */
public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
