package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * packageName    : lang.clazz
 * fileName       : ClassMetaMain
 * author         : wnsgh
 * date           : 2024-11-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-05        wnsgh       최초 생성
 */
public class ClassMetaMain {
    public static void main(String[] args) {
        //Class 조회
        Class clazz1 = String.class; //1. 클래스에서 조회
        //Class clazz2 = new String().getClass(); //2. 인스턴스에서 조회
        //Class clazz3 = Class.forName("java.lang.String"); //3. 문자열로 조회

        //모든 필드 출력
        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + ", name = " + field.getName());
        }

        //모든 메서드 출력
        Method[] methods = clazz1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method.getName() = " + method);
        }

        //상위 클래스 정보 출력
        System.out.println("Super Class: "+ clazz1.getSuperclass());

        //인터페이스 정보 출력
        Class[] interfaces = clazz1.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("anInterface = " + anInterface.getName());
        }
    }
}
