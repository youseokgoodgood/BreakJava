package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        /*
        * ElectricCar 객체 생성 시, 참조값은 Car 와 ElectricCar 두가지 클래스 정보가 공존함
        * 외부에서는 하나의 인스턴스를 생성하는 것 같지만, 내부에서는 부모와 자식이 모두 생성되고 공간도 구분 된다.
        *
        * charge() 메서드 호출 시, 호출하는 변수의 타입(클래스)을 기준으로 선택함.
        * 만약 자식 클래스에 없는(상속받은 기능) move() 메서드와 같이 있다면, 부모 타입으로 올라가서 찾는다.
        *
        * 정리
        * - 상속 관계의 객체를 생성하면, 그 내부에는 부모와 자식이 모두 생성된다.
        * - 상속 관계의 객체를 호출 할 때, 대상 타입을 정해야하며, 이때 호출자의 타입을 통해 대상 타입을 찾는다.
        * - 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행하며, 못 찾을 시 컴파일 오류 발생 
        * */
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
