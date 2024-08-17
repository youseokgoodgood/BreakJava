package final1;

/**
 * packageName    : final1
 * fileName       : MemberMain
 * author         : wnsgh
 * date           : 2024-08-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-17        wnsgh       최초 생성
 */
public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2","seo");
        member.print();
    }
}
