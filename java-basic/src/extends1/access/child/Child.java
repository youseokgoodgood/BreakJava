package extends1.access.child;

import extends1.access.parent.Parent;

/**
 * packageName    : extends1.access.child
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

    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류


        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지
        //defaultMethod();
        //privateMethod();

        printParent();
    }
}
