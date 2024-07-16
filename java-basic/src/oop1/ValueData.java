package oop1;

public class ValueData {
/*
*  클래스는 속성(데이터,멤버변수)과 기능(메서드)을 정의할 수 있다
*  객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근 할 수 있다.
*
* */


    int value;

    void add() {
        value++; // 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수 이다.
        System.out.println("숫자 증가 value=" + value);
    }
}
