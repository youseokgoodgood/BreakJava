package ref;

public class MethodChange2 {

    /*
     *  참조형 메서드 호출
     *  메서드로 참조형 데이터를 전달 시, 참조 값이 복사되어 전달됨.
     *  메서드 내부에서 파라미터의 객체 멤버변수를 변경하면, 호출자의 객체도 변경된다.
     *
     * */

    public static void main(String[] args) {
        Date dateA = new Date();
        dateA.value = 10;

        System.out.println("메서드 호출 전: dateA.value = "+ dateA.value);
        changeReference(dateA);
        System.out.println("메서드 호출 후: dateA.value = "+ dateA.value);
    }

     static void changeReference(Date dateX) {
         dateX.value = 20;
    }

}
