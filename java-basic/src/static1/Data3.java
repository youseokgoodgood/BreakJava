package static1;

/**
 * packageName    : static1
 * fileName       : Data3
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class Data3 {
    public String name; //멤버변수면서, 인스턴스 변수
    public static int counter;// 멤버변수면서, 클래스 변수

    public Data3(String name) {
        this.name = name;
        counter++;
    }
}
