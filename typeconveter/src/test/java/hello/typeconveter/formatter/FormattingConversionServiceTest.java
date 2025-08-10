package hello.typeconveter.formatter;

import hello.typeconveter.converter.IpPortToStringConverter;
import hello.typeconveter.converter.StringToPortConverter;
import hello.typeconveter.type.IpPort;
import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;
import static org.assertj.core.api.Assertions.*;

/**
 * packageName    : hello.typeconveter.formatter
 * fileName       : FormattingConversionServiceTest
 * author         : sim-yuoseok
 * date           : 2025-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-10        sim-yuoseok       최초 생성
 */
public class FormattingConversionServiceTest {

    @Test
    public void formattingConversionService() {
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();

        //컨버터 등록
        conversionService.addConverter(new StringToPortConverter());
        conversionService.addConverter(new IpPortToStringConverter());

        //포맷터 등록
        conversionService.addFormatter(new MyNumberFormatter());

        //컨버터 사용
        IpPort ipPort = conversionService.convert("127.0.0.1:8080", IpPort.class);

        assertThat(ipPort).isEqualTo(new IpPort("127.0.0.1", 8080));

        //포맷터 사용
        assertThat(conversionService.convert(1000, String.class)).isEqualTo("1,000");
        assertThat(conversionService.convert("1,000",Long.class)).isEqualTo(1000L);

    }
}
