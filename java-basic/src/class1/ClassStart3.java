package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        /*
        * 
        * 객체 또는 인스턴스 
        * 
        *  Student student1 = new Student();
        *  Student student2 = new Student();
        *   -> 실제 메모리에 확보해서 객체를 만듬
        *
        * 1. 변수 선언
        * Student student1; // Student 타입을 받는 student1 변수, Student타입의 객체(인스턴스)를 받을 수 있다.
        *
        * 2. 객체생성
        *  student1 = new Student();//메모리에 실제  Student 인스턴스(객체) 생성, 멤버 변수를 사용하기 위한 필요한 메모리 공간도 함께 확보함
        *
        * 3. 참조값 보관
        * student1 = x001(생성된 인스턴스의 참조값,메모리 주소값); //Student 인스턴스 참조값 보관
        *  -> student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용함
        *
         */

        Student student1; // Student 타입을 받는 student1 변수, Student타입의 객체(인스턴스)를 받을 수 있다.
        student1 = new Student();//메모리에 실제  Student 인스턴스(객체) 생성, 멤버 변수를 사용하기 위한 필요한 메모리 공간도 함께 확보함
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        //System.out.println("이름:" + student1.name + " 나이:"+student1.age+" 성적:"+ student1.grade);
        //System.out.println("이름:" + student2.name + " 나이:"+student2.age+" 성적:"+ student2.grade);

    }
}
