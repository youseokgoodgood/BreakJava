package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * author         : SYS
 * date           : 2025-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-18        SYS       최초 생성
 */
public class FormattingMain1 {
    public static void main(String[] args) {
        //포매팅: 날짜를 문자로
        LocalDate dt = LocalDate.of(2024, 12, 31);
        System.out.println("dt = " + dt);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formatted = dt.format(formatter);
        System.out.println("formatted = " + formatted);

        //파싱: 문자를 날짜로
        String input = "2025년 01월 01일";
        LocalDate parse = LocalDate.parse(input, formatter);
        System.out.println("parse = " + parse);
    }
}
