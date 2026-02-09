package String;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName    : String
 * fileName       : GroupWordChecker
 * author         : sim-yuoseok
 * date           : 2025-11-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-12        sim-yuoseok       최초 생성
 */
public class GroupWordChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0; // 그룹 단어

        // 입력 받은 단어 개수만큼 반복
        for (int i = 0; i < n; i++) {
            // 현재 단어 입력
            String s = br.readLine();

            // 이미 등장한 문자를 저장할 Set
            Set<Character> used = new HashSet<>();

            // 바로 이전 문자 (초기값 공백 문자)
            char prev = ' ';

            // 그룹 단어 여부 판단 플래그
            boolean isGroupWord = true;

            // 현재 단어의 문자들을 순회
            for (char c : s.toCharArray()) {
                // 이전 문자와 다를 때만 검사
                if (c != prev) {
                    // 이미 사용된 문자라면 그룹 단어가 아님
                    if (used.contains(c)) {
                        isGroupWord = false;
                        break;
                    }
                    // 처음 등장한 문자라면 Set에 추가
                    used.add(c);
                }
                // 현재 문자를 이전 문자로 저장
                prev = c;
            }

            // 그룹 단어라면 카운트 증가
            if (isGroupWord){
                count++;
            }
        }


        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
