package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Date dateA = new Date(); //Date 인스턴스 참조 주소 값을 dataA 변수에 복사
        dateA.value = 10; //10 대입
        Date dateB = dateA; //dateA 참조 주소값을 dateB에 대입

        //주소값 같음
        System.out.println("dateA 참조값 = " + dateA);
        System.out.println("dateB 참조값 = " + dateB);

        //10이 담겨있는 참조 주소값을 찾아가 10을 출력
        System.out.println("dataA.value = " + dateA.value);
        System.out.println("dataB.value = " + dateB.value);

        //dateA 변경
        dateA.value = 20;
        System.out.println("dataA.value = " + dateA.value);
        System.out.println("dataB.value = " + dateB.value);

        //dateB 변경
        dateB.value = 30;
        System.out.println("dataA.value = " + dateA.value);
        System.out.println("dataB.value = " + dateB.value);
    }
}
