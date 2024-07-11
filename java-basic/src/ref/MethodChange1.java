package ref;

public class MethodChange1 {

    /*
    *  기본형 메서드 호출
    *  메서드로 기본형 데이터를 전달 시, 해당 값이 복사되어 전달됨.
    *  메서드 내부에서 파라미터의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
    * 
    * 지역 변수는 항상 직접 초기화해야함
    *
    * */

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = "+ a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = "+ a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
