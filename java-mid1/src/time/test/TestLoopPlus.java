package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * author         : SYS
 * date           : 2025-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-18        SYS       최초 생성
 */
public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plusWeeks(2 * i);
            System.out.println(nextDate);
        }
    }
}
