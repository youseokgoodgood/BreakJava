package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    //this 자기자신의 인스턴스를 가리킴
    //this, 자기 자신의 값을 외부에서 받아서 자기 자신의 값을 바꿈
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
