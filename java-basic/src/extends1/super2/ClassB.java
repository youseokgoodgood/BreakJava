package extends1.super2;

/**
 * packageName    : extends1.super2
 * fileName       : ClassB
 * author         : wnsgh
 * date           : 2024-08-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-25        wnsgh       최초 생성
 */
public class ClassB extends ClassA {

    public ClassB(int a) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a ="+ a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a="+a+ " b="+b);
    }
}
