package lang.string.builder;

/**
 * packageName    : lang.string.builder
 * fileName       : StringBuilderMain1_1
 * author         : wnsgh
 * date           : 2024-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-17        wnsgh       최초 생성
 */
public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        /*
        * 가변 (StringBuilder): 하나의 StringBuilder 객체 안에서 문자열을 추가,삭제,수정 할 수 있으며, 이때마다 새로운 객체를 생성하지 않는다. 이로 인해 메모리 사용을 줄이고 성능을 향상 가능
        * 단, 사이트 이펙트를 주의!!
        * 
        * 불변(String): 한번 생성되면 그 내용을 변경 불가하며, 문자열에 변화를 주려고 할 때마다 새로운 String 객체가 생성되고, 기존 객체는 버림. 이 과정에서 메모리와 처리 시간을 더 많이 소모한다.
        *
        * StringBuilder는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 안전한(불변) String으로 변환하는것이 좋음
        * 
        * */

        StringBuilder sb = new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("sb.insert = " + sb);

        sb.delete(4, 8);
        System.out.println("sb.delete = " + sb);

        sb.reverse();
        System.out.println("sb.reverse = " + sb);

        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
