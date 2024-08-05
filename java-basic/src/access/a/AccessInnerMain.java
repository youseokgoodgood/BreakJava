package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        //public 호출 가능
        accessData.publicField = 1;
        accessData.publicMethod();

        //같은 패키지 default 호출 가능
        accessData.defaultField = 2;
        accessData.defaultMethod();

        //private 호출 불가

        accessData.innerAccess();

    }
}
