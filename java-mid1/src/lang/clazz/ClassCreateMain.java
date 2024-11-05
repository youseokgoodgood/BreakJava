package lang.clazz;

import java.lang.reflect.InvocationTargetException;

/**
 * packageName    : lang.clazz
 * fileName       : ClassCreateMain
 * author         : wnsgh
 * date           : 2024-11-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-05        wnsgh       최초 생성
 */
public class ClassCreateMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       Class helloClass =  Hello.class;


        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String hello1 = hello.sayHello();
        System.out.println("hello1 = " + hello1);

    }
}
