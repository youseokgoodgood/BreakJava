package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * author         : SYS
 * date           : 2025-01-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-16        SYS       최초 생성
 */
public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("Year = " + dt.get(ChronoField.YEAR));
        System.out.println("Month = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DayOfMonth = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("DayOfWeek = " + dt.get(ChronoField.DAY_OF_WEEK));
        System.out.println("DayOfYear = " + dt.get(ChronoField.DAY_OF_YEAR));
        System.out.println("Hour = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Minute = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Second = " + dt.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("Millisecond = " + dt.get(ChronoField.MILLI_OF_SECOND));
        System.out.println("NanoSecond = " + dt.get(ChronoField.NANO_OF_SECOND));

        System.out.println("편의 메서드 제공");
        System.out.println("Year = " + dt.getYear());
        System.out.println("Month = " + dt.getMonth());
        System.out.println("DayOfMonth = " + dt.getDayOfMonth());
        System.out.println("DayOfWeek = " + dt.getDayOfWeek());
        System.out.println("Hour = " + dt.getHour());
        System.out.println("Minute = " + dt.getMinute());
        System.out.println("Second = " + dt.getSecond());
    }
}
