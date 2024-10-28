package lang.wrapper;

/**
 * packageName    : lang.wrapper
 * fileName       : MyIntegerNullMain0
 * author         : wnsgh
 * date           : 2024-10-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-28        wnsgh       최초 생성
 */
public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};

        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));
    }

    private static int findValue(int[] intArr,int target) {
        for (int value : intArr) {
            if(value == target){
                return value;
            }
        }
        return -1;
    }
}
