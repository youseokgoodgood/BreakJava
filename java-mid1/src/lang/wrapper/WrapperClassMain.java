package lang.wrapper;

/**
 * packageName    : lang.wrapper
 * fileName       : WrapperClassMain
 * author         : wnsgh
 * date           : 2024-10-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-28        wnsgh       최초 생성
 */
public class WrapperClassMain {

    public static void main(String[] args) {
        //기본형을 래퍼 클래스로 변경하는 것을 박싱이라함
        Integer newInteger = new Integer(10); //추후 삭제예정, 대신에 valueOf()를 사용
        Integer intergerObj = Integer.valueOf(10); //-128~127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("intergerObj = " + intergerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부값 읽기");
        int intValue = intergerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == intergerObj));
        System.out.println("equals: " + (newInteger.equals(intergerObj)));

    }
}
