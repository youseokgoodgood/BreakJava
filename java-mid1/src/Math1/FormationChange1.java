package Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**60466175 36
 * packageName    : Math1
 * fileName       : FormationChange
 * author         : sim-yuoseok
 * date           : 2026-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-02-09        sim-yuoseok       최초 생성
 */
public class FormationChange1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String number = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        long decimalValue = Long.parseLong(number,n);

        System.out.println(decimalValue);

    }
}
