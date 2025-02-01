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
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        //오류상황 만들기
        client.initError(data);

        String connectResult = client.connect();

        if(isSuccess(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드"+ connectResult);
        }else {
            String sendResult = client.send(data);
            if(isSuccess(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드" + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("success");
    }
}
