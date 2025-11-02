package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : AscllCodeToString
 * author         : sim-yuoseok
 * date           : 2025-11-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-01        sim-yuoseok       최초 생성
 */
public class AsciiCodeToString {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);
        System.out.println((int) ch);
    }
}
