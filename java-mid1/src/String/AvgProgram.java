package String;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : String
 * fileName       : AvgProgram
 * author         : sim-yuoseok
 * date           : 2025-11-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-15        sim-yuoseok       최초 생성
 */
public class AvgProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //과목평균표
        Map<String, Double> gradTable = Map.of(
                "A+", 4.5, "A0", 4.0, "B+", 3.5, "B0", 3.0,
                "C+", 2.5, "C0", 2.0, "D+", 1.5, "D0", 1.0, "F", 0.0
        );

        //학생 총점
        double totalCredit = 0.0;
        //과목평균총점
        double totalWeightedScore = 0.0;

        //총 20줄에 대한 입력 값을 받기 위한 반복문
        for (int i = 0; i < 20; i++) {
            //과목,학생 점수,등급 나누기
            String[] studentGrades = br.readLine().split(" ");
            //학생점수
            double credit = Double.parseDouble(studentGrades[1]);
            //등급
            String grade = studentGrades[2];

            //P등급 제외
            if(!"P".equals(grade)){
                //학생 과목 총합
                totalCredit  += credit;
                //과목 총합 + 과목평균총점
                totalWeightedScore += (credit * gradTable.get(grade));
            }
        }

        bw.write(String.format("%.6f", totalWeightedScore/totalCredit));
        bw.flush();
        bw.close();

    }
}
