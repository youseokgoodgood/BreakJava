package exception.ex0;

/**
 * author         : SYS
 * date           : 2025-01-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-29        SYS       최초 생성
 */
public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "SUCCESS";
    }

    public String send(String data) {
        //전송성공
        System.out.println(address + "서버에 데이터 전송: " + data);
        return "SUCCESS";
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }
}
