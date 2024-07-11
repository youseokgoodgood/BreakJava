package ref;

public class NullMain2 {
    
    /*
    * Date date = null; 
    *  아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해줌
    * 
    *  객체는 해당 객체를 참조하는 곳이 있으면, JVM이 종료 할 때까지 계속 생존함.
    *  하지만 중간에 해당 객체를 참조하는 곳이 모두 사라지면 JVM은 필요 없는 객체를 판단하고 GC를 사용해서 제거함
    * */
    
    public static void main(String[] args) {
        Date date = null;
        date.value = 10; //NullPointerException 예외 발생
        System.out.println("date = " + date.value);

    }
}


