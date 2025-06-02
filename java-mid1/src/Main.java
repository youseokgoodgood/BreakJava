/**
 * packageName    :
 * fileName       : ${NAME}
 * author         : wnsgh
 * date           : 2024-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-18        wnsgh       최초 생성
 *///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = {"2000","1999"};
        //int year = Integer.parseInt("2000");

        int h = Integer.parseInt("14");
        int m = Integer.parseInt("30");
        int cookTime = Integer.parseInt("20");

        m += cookTime;

        if (m >= 60) {
            h += (m/60);
            m %= 60;

            if (h > 23) {
                h -= 24;
            }
        }
        System.out.println(h + " " + m);


    }
}