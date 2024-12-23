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
public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name()+" 등급의 할인 금액: " + grade.discount(price));
    }
}
