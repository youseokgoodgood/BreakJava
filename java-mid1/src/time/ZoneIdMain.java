package time;

import java.time.ZoneId;
import java.util.Set;

/**
 * author         : SYS
 * date           : 2025-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-12        SYS       최초 생성
 */
public class ZoneIdMain {

    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        for (String availableZoneId : availableZoneIds) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + ": " + zoneId.getRules());
        }
    }
}
