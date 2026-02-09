package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : CroatiaAlphabet
 * author         : sim-yuoseok
 * date           : 2025-11-11
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-11        sim-yuoseok       최초 생성
 */

public class CroatiaAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //크로아티아 알파벳 배열
        String[] croatiaAlphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        //입력받은 문자열
        String str = br.readLine();

        for (String s : croatiaAlphabet) {
            //크로아티아 문자만 *로 치환
            str = str.replace(s,"*");
        }

        bw.write(""+str.length());

        bw.flush();
        bw.close();
    }
}
