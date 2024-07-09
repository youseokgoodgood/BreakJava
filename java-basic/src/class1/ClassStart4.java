package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1; // Student 타입을 받는 student1 변수, Student타입의 객체(인스턴스)를 받을 수 있다.
        student1 = new Student();//메모리에 실제  Student 인스턴스(객체) 생성, 멤버 변수를 사용하기 위한 필요한 메모리 공간도 함께 확보함
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};


//        for (int i = 0; i < students.length; i++) {
//            System.out.println("이름:" + students[i].name + " 나이:"+students[i].age+" 성적:"+ students[i].grade);
//        }

        for (Student s :students) {
            System.out.println("이름:" + s.name + " 나이:"+s.age+" 성적:"+ s.grade);
        }

        //System.out.println("이름:" + student1.name + " 나이:"+student1.age+" 성적:"+ student1.grade);
        //System.out.println("이름:" + student2.name + " 나이:"+student2.age+" 성적:"+ student2.grade);
    }
}
