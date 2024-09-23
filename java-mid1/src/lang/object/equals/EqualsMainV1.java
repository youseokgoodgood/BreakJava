package lang.object.equals;

/**
 * packageName    : lang.object.equals
 * fileName       : EqualsMainV1
 * author         : wnsgh
 * date           : 2024-09-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-23        wnsgh       최초 생성
 */

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        /*
        * 동일성(identity) == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
        *  -> 동일은 완전히 같음을 의미하며, 물리적으로 같은 메모리에 있는 객체 인스턴스인지 참조값을 확인함.
        *  -> 자바 머신 기준이고 메모리의 참조가 기준으로 물리적이다.
        *
        * 동등성(equality) equals()메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
        *  -> 동등은 같은 가치나 수준을 의미하지만, 그 형태나 외관 등이 완전히 같지는 않을 수 있음
        *  -> 동등성은 논리적으로 같은지 확인 하는 것이며, 보통 사람이 생각하는 논리적인 기준에 맞추어 비교함.
        *
        *
        * */

        System.out.println("identity = " + (userV1 == userV2));
        System.out.println("identity = " + (userV1.equals(userV2)));
    }
}
