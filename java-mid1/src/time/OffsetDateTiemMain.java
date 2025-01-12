package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * author         : SYS
 * date           : 2025-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-12        SYS       최초 생성
 */
public class OffsetDateTiemMain {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.now();
        System.out.println(dateTime);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println(ldt);
        OffsetDateTime dateTime2 = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println(dateTime2);
    }
}
