package Controller;

import domain.ExchangeRate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ExchangeRateService;

import java.util.List;

@RestController
@RequestMapping("api")
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping("/")
    public String testAPI() {
        return "hello";
    }

    @GetMapping("/exchange-rates")
    public List<ExchangeRate> getExchangeRates() {
        return exchangeRateService.getExchangeRates();
    }
}
