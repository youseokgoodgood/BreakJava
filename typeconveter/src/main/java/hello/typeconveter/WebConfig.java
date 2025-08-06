package hello.typeconveter;

import hello.typeconveter.converter.IntegerToStringConverter;
import hello.typeconveter.converter.IpPortToStringConverter;
import hello.typeconveter.converter.StringToIntergerConverter;
import hello.typeconveter.converter.StringToPortConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName    : hello.typeconveter
 * fileName       : Webconfig
 * author         : sim-yuoseok
 * date           : 2025-08-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-06        sim-yuoseok       최초 생성
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToIntergerConverter());
        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToPortConverter());
        registry.addConverter(new IpPortToStringConverter());
    }
}
