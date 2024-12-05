package enumeration.ex2;

/**
 * author         : SYS
 * date           : 2024-12-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-03        SYS       최초 생성
 */
public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC = "+ClassGrade.BASIC);
        System.out.println("ref GOLD = "+ClassGrade.GOLD);
        System.out.println("ref DIAMOND = "+ClassGrade.DIAMOND);
    }
}
