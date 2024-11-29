package lang.math.test;

import java.util.Random;

/**
 * author         : SYS
 * date           : 2024-11-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-29        SYS       최초 생성
 */
public class LottoGenerator {

    private final Random random = new Random();
    private int [] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;

            if(isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }

        }
        return lottoNumbers;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < 6; i++) {
            if (number == lottoNumbers[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        for (int lottoNumber : lottoNumbers) {
            System.out.println(lottoNumber);
        }
    }
}
