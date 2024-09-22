package lang.object.tostring;

/**
 * packageName    : lang.object.tostring
 * fileName       : Dog
 * author         : wnsgh
 * date           : 2024-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        wnsgh       최초 생성
 */
public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
