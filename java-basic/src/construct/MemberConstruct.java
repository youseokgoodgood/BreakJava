package construct;


public class MemberConstruct {
    String name;
    int age;
    int grade;

    public MemberConstruct(String name, int age) {
        this(name,age,50); //자기자신 생성자 호출, 해당 코드는 생성자 코드의 첫줄에만 작성 가능함
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name+ ",age=" + age+",grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
