package time;

import java.time.LocalDate;
import java.time.Period;

/**
 * author         : SYS
 * date           : 2025-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-12        SYS       최초 생성
 */
public class PeroidMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 이용
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plus = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plus = " + plus);

        //기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between); //11개월 30일
        System.out.println("기간:" + between.getMonths() + "개월 " + between.getDays() + "일");



    }
}
