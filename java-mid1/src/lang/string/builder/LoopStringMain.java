package lang.string.builder;

/**
 * packageName    : lang.string.builder
 * fileName       : LoopStringMAIN
 * author         : wnsgh
 * date           : 2024-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-17        wnsgh       최초 생성
 */
public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";

        /*
        * 반복문의 루프 내부에서 최적화가 되는 것처럼 보이지만, 반복 횟수만큼 객체를 생성해야함
        *
        * StringBuilder를 직접 사용하는것이 더 좋은 경우
        * 1. 반복문에서 반복해서 문자를 연결할때
        * 2. 조건문을 통해 동적으로 문자열을 조합할 때
        * 3. 복잡한 문자열의 특정 부분을 변경해야 할 때
        * 4. 매우 긴 대용량 문자열을 다룰 때
        *
        * */
        
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java"; // 반복 횟수만큼 객체를 생성해야함
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("Time = " + (endTime - startTime) + "ms");

    }
}
