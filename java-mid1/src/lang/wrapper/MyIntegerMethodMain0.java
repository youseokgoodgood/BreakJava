package lang.wrapper;

/**
 * packageName    : lang.wrapper
 * fileName       : MyIntegerMethodMain0
 * author         : wnsgh
 * date           : 2024-10-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-21        wnsgh       최초 생성
 */
public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value,5);
    }

    public static int compareTo(int value, int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else {
            return 0;
        }
    }
}
