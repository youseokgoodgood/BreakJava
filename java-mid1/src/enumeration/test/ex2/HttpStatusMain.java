package enumeration.test.ex2;

import java.util.Scanner;

/**
 * author         : SYS
 * date           : 2024-12-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-25        SYS       최초 생성
 */
public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code: ");
        int httpCodeInput = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);

        if (status == null) {
            System.out.println("Unknown HTTP status code: " + httpCodeInput);
        } else {
            System.out.println("HTTP status code: " + httpCodeInput);
            System.out.println("isSuccess: " + status.isSuccess());
        }

    }
}
