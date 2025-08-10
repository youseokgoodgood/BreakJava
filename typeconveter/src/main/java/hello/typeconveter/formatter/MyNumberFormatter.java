package hello.typeconveter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * packageName    : hello.typeconveter.formatter
 * fileName       : MyNumberFormatter
 * author         : sim-yuoseok
 * date           : 2025-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-08-10        sim-yuoseok       최초 생성
 */

@Slf4j
public class MyNumberFormatter implements Formatter<Number> {

    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text: {}, locale: {}", text,locale);
        //"1,000" -> 1000
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        return numberFormat.parse(text);
    }

    @Override
    public String print(Number object, Locale locale) {
        log.info("object: {}, locale: {}", object,locale);
        return NumberFormat.getInstance(locale).format(object);
    }
}
