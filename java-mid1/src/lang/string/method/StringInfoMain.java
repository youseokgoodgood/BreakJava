package lang.string.method;

/**
 * packageName    : lang.string.method
 * fileName       : StringInfoMain
 * author         : wnsgh
 * date           : 2024-10-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-16        wnsgh       최초 생성
 */
public class StringInfoMain {

    public static void main(String[] args) {
//        String str = "Hello, Java!";
//        System.out.println("문자열의 길이: " + str.length());
//        System.out.println("문자열이 비어 있는지: " + str.isEmpty());
//        System.out.println("문자열이 비어 있거나 공백인지1: " + str.isBlank()); //Java11
//        System.out.println("문자열이 비어 있거나 공백인지2: " + " ".isBlank());
//        char c = str.charAt(7);
//        System.out.println("7번 인덱스의 문자: " + c);

        String str = "47170310";
        System.out.println("str.substring(0,2) = " + str.substring(0,2));
        System.out.println("str.substring(2,5) = " + str.substring(2,5));
        System.out.println("str.substring(6,3) = " + str.substring(5,8));
    }
}
