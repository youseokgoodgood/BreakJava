package hello.typeconveter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * packageName    : hello.typeconveter.type
 * fileName       : IpPort
 * author         : sim-yuoseok
 * date           : 2025-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-03        sim-yuoseok       최초 생성
 */

@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

}
