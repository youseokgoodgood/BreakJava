package lang.wrapper;

/**
 * packageName    : lang.wrapper
 * fileName       : AutoboxingMain1
 * author         : wnsgh
 * date           : 2024-10-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-28        wnsgh       최초 생성
 */
public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxValue = Integer.valueOf(value);

        //Wrapper -> Primitive
        int unboxedValue = boxValue.intValue();

        System.out.println("boxValue = " + boxValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
