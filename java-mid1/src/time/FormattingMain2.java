package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * author         : SYS
 * date           : 2025-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-18        SYS       최초 생성
 */
public class FormattingMain2 {
    public static void main(String[] args) {
        //포매팅: 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println(formatted);
        System.out.println("now = " + now);

        //파싱: 문자를 날짜와 시간으로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println(dateTime);

    }
}
