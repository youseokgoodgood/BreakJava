package lang.object.tostring;

/**
 * packageName    : lang.object.tostring
 * fileName       : ObjectPrinter
 * author         : wnsgh
 * date           : 2024-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        wnsgh       최초 생성
 */
public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력 : " + obj.toString();
        System.out.println(string);
    }
}
