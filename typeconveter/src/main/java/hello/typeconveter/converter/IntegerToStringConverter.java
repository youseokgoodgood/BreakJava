package hello.typeconveter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * packageName    : hello.typeconveter.converter
 * fileName       : IntegerToStringConverter
 * author         : sim-yuoseok
 * date           : 2025-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-03        sim-yuoseok       최초 생성
 */

@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {

    @Override
    public String convert(Integer source) {
      log.info("IntegerToStringConverter convert: {}", source);
        return String.valueOf(source);
    }
}
