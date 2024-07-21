package service;

import domain.ExchangeRate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ExchangeRateService {

    @Value("${eximbank.api.url}")
    private String apiUrl;

    @Value("${eximbank.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public ExchangeRateService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<ExchangeRate> getExchangeRates() {
        //하루 요청 가능한 수는 1000건임
        List<ExchangeRate> allExchangeRates = new ArrayList<>();
        LocalDate startDate = LocalDate.of(2024, 7, 16);
        LocalDate endDate = LocalDate.of(2024, 7, 18);

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                String formattedDate = date.toString().replace("-", "");
                String url = String.format(apiUrl, apiKey, formattedDate);
                System.out.println("만들어진 url = " + url);

            try {
                ExchangeRate[] exchangeRates = restTemplate.getForObject(url, ExchangeRate[].class);
                if (exchangeRates != null) {
                    allExchangeRates.addAll(Arrays.asList(exchangeRates));
                }
            } catch (Exception e) {
                // Log or handle the exception
                System.err.println("Error fetching data for date: " + formattedDate);
            }
        }
        return allExchangeRates;
    }
}
