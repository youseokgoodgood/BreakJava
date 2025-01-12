package time;

import java.time.Duration;
import java.time.LocalTime;

/**
 * author         : SYS
 * date           : 2025-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-12        SYS       최초 생성
 */
public class DurationMan {
    public static void main(String[] args) {
        Duration duration = Duration.ofSeconds(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        //계산 이용
        LocalTime plus = lt.plus(duration);
        System.out.println("plus = " + plus);

        //시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration d = Duration.between(start, end);
        System.out.println("d = " + d); //1시간 차이

        System.out.println("차이: " + d.getSeconds() + "초");
        System.out.println("근무 시간: "+ d.toHours() + "시간" + d.toMinutesPart() + "분");


    }
}
