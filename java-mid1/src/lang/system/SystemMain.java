package lang.system;

import java.util.Arrays;

/**
 * packageName    : lang.system
 * fileName       : SystemMain
 * author         : wnsgh
 * date           : 2024-11-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-05        wnsgh       최초 생성
 */
public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져옴
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        // 환경변수를 읽음
        System.out.println("getenv : " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("getprop : " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));
        
        // 배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copyArray = new char[5];

        System.arraycopy(originalArray, 0, copyArray, 0, originalArray.length);
        System.out.println("copyArray = " + copyArray);
        System.out.println("Arrays.toString(copyArray) = " + Arrays.toString(copyArray));

        //시스템 종료
        System.exit(0);
    }
}
