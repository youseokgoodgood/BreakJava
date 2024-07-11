package ref;

public class Method2 {

    /*
     * 멤버변수 : 자동 초기화
     * 인스턴스 멤버변수는 인스턴스를 생성 시, 자동으로 초기화함
     * 숫자(int) = 0, boolean= false, 참조형 = null
     * 개발자가 초기값을 직접 지정할 수 있음
     *
     * */
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        student1 = createStudent("학생3",17,77);

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        student2 = createStudent("학생4",18,100);

        //initStudent(student1,"학생3",17,77);
        //initStudent(student2,"학생4",18,100);

        printStudent(student1);
        printStudent(student2);

        //System.out.println("이름:" + student1.name + " 나이:"+student1.age+" 성적:"+ student1.grade);
        //System.out.println("이름:" + student2.name + " 나이:"+student2.age+" 성적:"+ student2.grade);
    }

    static Student createStudent(String name , int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:"+student.age+" 성적:"+ student.grade);
    }
}
