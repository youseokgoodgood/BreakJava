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

//객체의 상태(객체 내부의 값, 필드, 멤버변수)가 변하지 않는 객체를 불변 객체라 한다.
public class ImmutableAdress {
    private final String value; //내부 값이 변경되면 안됨

    public ImmutableAdress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "Adress{" +
                "value='" + value + '\'' +
                '}';
    }
}
