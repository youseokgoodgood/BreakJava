package poly.diamond;

/**
 * packageName    : poly.diamond
 * fileName       : DiamondMian
 * author         : wnsgh
 * date           : 2024-09-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-08        wnsgh       최초 생성
 */
public class DiamondMian {
    public static void main(String[] args) {
        InterfaceA interfaceA = new Child();
        InterfaceB interfaceB = new Child();

        interfaceA.methodA();
        interfaceA.methodCommon();

        interfaceB.methodB();
    }
}
