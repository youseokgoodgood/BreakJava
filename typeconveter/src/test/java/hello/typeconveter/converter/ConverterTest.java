package hello.typeconveter.converter;

import hello.typeconveter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * packageName    : hello.typeconveter.converter
 * fileName       : ConverterTest
 * author         : sim-yuoseok
 * date           : 2025-08-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-03        sim-yuoseok       최초 생성
 */


public class ConverterTest {

    @Test
    void stringToInteger() {
        StringToIntergerConverter converter = new StringToIntergerConverter();
        Integer source = converter.convert("123");
        assertThat(source).isEqualTo(123);
    }

    @Test
    void integerToString() {
        IntegerToStringConverter converter = new IntegerToStringConverter();
        String source = converter.convert(123);
        assertThat(source).isEqualTo("123");
    }

    @Test
    void stringToIpPort() {
        IpPortToStringConverter converter = new IpPortToStringConverter();
        IpPort source = new  IpPort("127.0.0.1", 8080);
        String result = converter.convert(source);
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }

    @Test
    void ipPortToString() {
        StringToPortConverter converter = new StringToPortConverter();
        String source = "127.0.0.1:8080";
        IpPort result = converter.convert(source);
        assertThat(result).isEqualTo(new  IpPort("127.0.0.1", 8080));
    }
}
