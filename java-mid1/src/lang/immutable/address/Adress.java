package lang.immutable.address;

/**
 * packageName    : lang.immutable.address
 * fileName       : Adress
 * author         : wnsgh
 * date           : 2024-10-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-10        wnsgh       최초 생성
 */
public class Adress {
    private String value;

    public Adress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "value='" + value + '\'' +
                '}';
    }
}
