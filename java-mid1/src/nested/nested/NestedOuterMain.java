package nested.nested;

/**
 * author         : SYS
 * date           : 2025-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-19        SYS       최초 생성
 */
public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuterMain nestedOuterMain = new NestedOuterMain();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested = "+nested.getClass());
    }
}
