package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : StringAndString
 * author         : sim-yuoseok
 * date           : 2025-07-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-26        sim-yuoseok       최초 생성
 */
public class StringAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split("");

        int i = Integer.parseInt(br.readLine());

        bw.write(str[i-1]+"\n");
        bw.flush();
        bw.close();

    }
}
