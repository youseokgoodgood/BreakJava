package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * author         : SYS
 * date           : 2025-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-12        SYS       최초 생성
 */
public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " +zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50,0,ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " +zdt2);

        ZonedDateTime utc = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " +utc);

    }
}
