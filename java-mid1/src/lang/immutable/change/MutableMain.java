package lang.immutable.change;

/**
 * packageName    : lang.immutable.change
 * fileName       : MutableMain
 * author         : wnsgh
 * date           : 2024-10-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-12        wnsgh       최초 생성
 */
public class MutableMain {

    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        System.out.println("obj = " + obj.getValue());


    }
}
