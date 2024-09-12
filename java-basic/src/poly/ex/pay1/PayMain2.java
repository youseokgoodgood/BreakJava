package poly.ex.pay1;

import java.util.Scanner;

/**
 * packageName    : poly.ex.pay0
 * fileName       : PayMain0
 * author         : wnsgh
 * date           : 2024-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-12        wnsgh       최초 생성
 */
public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제수단을 입력하세요: ");
            String payOption = sc.nextLine();

            if(payOption.equals("exit")){
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

            System.out.println("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine();
            
            payService.processPay(payOption, amount);

        }
    }
}
