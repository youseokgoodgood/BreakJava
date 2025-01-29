package exception.ex1;

/**
 * author         : SYS
 * date           : 2025-01-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-29        SYS       최초 생성
 */
public class NetworkClientV1 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if(connectError) {
            System.out.println(address + "서버 연결 실패");
            return "connectError";
        }

        //연결 성공
        System.out.println(address + "서버 연결 성공");
        return "SUCCESS";
    }

    public String send(String data) {
        if(sendError) {
            System.out.println(address + "서버에 데이터 전송 실패: " + data);
            return "sendError";
        }

        //전송성공
        System.out.println(address + "서버에 데이터 전송: " + data);
        return "SUCCESS";
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")){
            connectError = true;
        }

        if(data.contains("error2")){
            sendError = true;
        }
    }

}
