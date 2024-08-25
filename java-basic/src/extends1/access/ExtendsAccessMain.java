package extends1.access;

import extends1.access.child.Child;

/**
 * packageName    : extends1.access
 * fileName       : ExtendsAccessMain
 * author         : wnsgh
 * date           : 2024-08-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-25        wnsgh       최초 생성
 */
public class ExtendsAccessMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
