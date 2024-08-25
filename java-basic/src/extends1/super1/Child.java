package extends1.super1;

/**
 * packageName    : extends1.super1
 * fileName       : Child
 * author         : wnsgh
 * date           : 2024-08-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-25        wnsgh       최초 생성
 */
public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = "+ this.value); //this 생략 가능
        System.out.println("super value = "+super.value);

        this.hello();
        super.hello();
    }

    
}
