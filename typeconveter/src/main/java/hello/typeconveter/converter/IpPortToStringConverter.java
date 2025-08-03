package hello.typeconveter.converter;

import hello.typeconveter.type.IpPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconveter.converter
 * fileName       : IpPortToStringConverter
 * author         : sim-yuoseok
 * date           : 2025-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-03        sim-yuoseok       최초 생성
 */

@Slf4j
public class IpPortToStringConverter implements Converter<IpPort, String> {

    @Override
    public String convert(IpPort source) {
      log.info("convert: {}", source);
        return source.getIp()  + ":" + source.getPort();
    }
}
