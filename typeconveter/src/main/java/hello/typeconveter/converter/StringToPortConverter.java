package hello.typeconveter.converter;

import hello.typeconveter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconveter.converter
 * fileName       : StringToPortConverter
 * author         : sim-yuoseok
 * date           : 2025-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-03        sim-yuoseok       최초 생성
 */

@Slf4j
public class StringToPortConverter implements Converter<String, IpPort> {

    @Override
    public IpPort convert(String source) {
        log.info("source={}", source);

        String[] split = source.split(":");
        String ip = split[0];
        int port = Integer.parseInt(split[1]);
        return new IpPort(ip, port);
    }
}
