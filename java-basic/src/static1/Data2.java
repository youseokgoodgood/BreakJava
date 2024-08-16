package static1;

/**
 * packageName    : static1
 * fileName       : Data2
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class Data2 {
    public String name;

    public Data2(String name,Counter counter) {
        this.name = name;
        counter.count++;
    }

}
