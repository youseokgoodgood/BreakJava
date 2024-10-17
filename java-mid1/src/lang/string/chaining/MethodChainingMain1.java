package lang.string.chaining;

/**
 * packageName    : lang.string.chaining
 * fileName       : MethodChainingMain1
 * author         : wnsgh
 * date           : 2024-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-17        wnsgh       최초 생성
 */
public class MethodChainingMain1 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int value = adder.getValue();
        System.out.println("value = " + value);
    }
}
