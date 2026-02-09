package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : ChessToString
 * author         : sim-yuoseok
 * date           : 2025-11-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-08        sim-yuoseok       최초 생성
 */
public class ChessToString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int[] chessPieces = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < chessPieces.length; i++) {
            chessPieces[i] -= Integer.parseInt(strs[i]);
        }

        for (int piece : chessPieces) {
            bw.write(piece + " ");
        }

        bw.flush();
        bw.close();
    }
}
