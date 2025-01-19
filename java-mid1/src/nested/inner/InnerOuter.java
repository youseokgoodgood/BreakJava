package nested.inner;

/**
 * author         : SYS
 * date           : 2025-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-19        SYS       최초 생성
 */
public class InnerOuter {

    private static int outClaasValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;

        public void print(){
            //자신의 멤버에 접근
            System.out.println(innerInstanceValue);

            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능
            System.out.println(outInstanceValue);

            //외부 클래스의 클래스 멤버에는 접근 가능. private도 접근 가능
            System.out.println(InnerOuter.outClaasValue);
        }

    }
}
