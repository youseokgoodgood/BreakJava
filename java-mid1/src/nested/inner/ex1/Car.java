package nested.inner.ex1;

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

    public Car(String model,int chargeLevel) {
        this.chargeLevel = chargeLevel;
        this.model = model;
        this.engine = new Engine(this);
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public String getModel() {
        return model;
    }

    public void start(){
        engine.start();
        System.out.println(engine + "시작 완료");
    }
}
