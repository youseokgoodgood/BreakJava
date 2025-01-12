package time;

import java.time.Instant;
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
public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();//UTC 기준
        System.out.println("now: "+now); //현재 한국시간  -9 한 시간이 나옴 | 영국 <-> 한국 간 9시간 시차가 나기 때문에

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from : "+from);

        Instant epochSecond = Instant.ofEpochSecond(0);
        System.out.println("epochSecond = " + epochSecond);

        //계산
        Instant later = epochSecond.plusSeconds(3600);
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

        /*
        * Peroid
        * : 두 날짜 사이의 간격을 년,월,일 단위로 나타낸다.
        *
        * Duration
        * : 두 시간 사이의 간격을 시,분,초 단위로 나타낸다.
        *
        * */
    }
}
