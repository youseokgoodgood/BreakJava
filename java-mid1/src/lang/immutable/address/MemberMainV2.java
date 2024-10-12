package lang.immutable.address;

/**
 * packageName    : lang.immutable.address
 * fileName       : MemberMainV1
 * author         : wnsgh
 * date           : 2024-10-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-12        wnsgh       최초 생성
 */
public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAdress adress = new ImmutableAdress("서울");

        MemberV2 memberA = new MemberV2("회원A", adress);
        MemberV2 memberB = new MemberV2("회원B", adress);

        //회원A,회원B 처음 주소는 모두서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B 주소를 부산으로 변경
        //memberB.getAddress().setValue("부산");
        memberB.setAddress(new ImmutableAdress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);


    }
}
