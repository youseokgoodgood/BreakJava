package exception.ex1;

import java.util.Scanner;

/**
 * author         : SYS
 * date           : 2025-01-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-29        SYS       최초 생성
 */
public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 networkServiceV0 = new NetworkServiceV1_1();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("exit")){
                break;
            }

            networkServiceV0.sendMessage(command);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료 합니다.");

    }
}
