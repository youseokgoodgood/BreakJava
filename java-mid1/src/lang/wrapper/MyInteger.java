package lang.wrapper;

/**
 * packageName    : lang.wrapper
 * fileName       : MyInteger
 * author         : wnsgh
 * date           : 2024-10-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-21        wnsgh       최초 생성
 */
public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target){
        if(value < target){
            return -1;
        }else if(value > target){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}
