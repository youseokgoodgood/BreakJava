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
public class MemberV1 {

    private String name;
    private Adress address;

    public MemberV1(String name, Adress address) {
        this.name = name;
        this.address = address;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
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
