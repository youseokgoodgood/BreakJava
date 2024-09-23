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


//println 작동방식 예시를 위한 간단한 구현
public class ObjectPrinter {
    public static void print(Object obj) {
        String string = "객체 정보 출력 : " + obj.toString();
        System.out.println(string);
    }
}
