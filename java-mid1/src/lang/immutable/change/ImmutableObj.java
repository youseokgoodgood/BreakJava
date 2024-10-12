package lang.immutable.change;

/**
 * packageName    : lang.immutable.change
 * fileName       : ImmutableObj
 * author         : wnsgh
 * date           : 2024-10-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-12        wnsgh       최초 생성
 */
public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }


}
