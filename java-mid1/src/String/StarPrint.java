package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : StarPrint
 * author         : sim-yuoseok
 * date           : 2025-11-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-09        sim-yuoseok       최초 생성
 */
public class StarPrint {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력 받은 값
        String input = br.readLine();

        //팰린드롬 값
        String palindrome = new StringBuilder(input).reverse().toString();

        //팰린드롬 값 여부 출력
       System.out.println(input.equals(palindrome) ? 1 : 0 );
    }
}
