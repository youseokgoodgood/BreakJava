package lang.immutable.address;

/**
 * packageName    : lang.immutable.address
 * fileName       : Member1
 * author         : wnsgh
 * date           : 2024-10-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-12        wnsgh       최초 생성
 */
public class MemberV2 {

    private String name;
    private ImmutableAdress address;

    public MemberV2(String name, ImmutableAdress address) {
        this.name = name;
        this.address = address;
    }

    public ImmutableAdress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAdress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
