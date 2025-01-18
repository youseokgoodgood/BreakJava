package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * author         : SYS
 * date           : 2025-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-18        SYS       최초 생성
 */
public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.println("월일 입력하세요: ");
        int month = scanner.nextInt();

        printCanlender(year, month);
    }

    private static void printCanlender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = firstDayOfMonth.plusMonths(1);

        //월요일=1 ... 일요일 7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.println("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;

        while (dayIterator.isBefore(lastDayOfMonth)) {
            System.out.printf("%2d", dayIterator.getDayOfMonth());

            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1);
        }
    }


}
