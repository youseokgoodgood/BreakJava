package enumeration.ref1;

/**
 * author         : SYS
 * date           : 2024-12-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-03        SYS       최초 생성
 */
public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return price * classGrade.getDIscountPercent() / 100;
    }
}
