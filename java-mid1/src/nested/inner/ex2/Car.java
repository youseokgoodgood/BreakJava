package nested.inner.ex2;

/**
 * author         : SYS
 * date           : 2025-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-19        SYS       최초 생성
 */
public class Car {

    private int chargeLevel;
    private String model;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine();
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public String getModel() {
        return model;
    }

    public void start(){
        engine.start();
        System.out.println(model + "시작 완료");
    }

    private class Engine {

        public void start(){
            System.out.println("충전 레벨 확인: "+ chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}
