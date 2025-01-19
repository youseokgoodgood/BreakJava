package nested;

/**
 * author         : SYS
 * date           : 2025-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-19        SYS       최초 생성
 */
public class ShdowingMain {

    public int value = 1;

    class Inner {
        public int value = 1;

        void go(){
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShdowingMain.value = " + ShdowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShdowingMain shdowingMain = new ShdowingMain();
        Inner inner = shdowingMain.new Inner();
        inner.go();
    }
}
