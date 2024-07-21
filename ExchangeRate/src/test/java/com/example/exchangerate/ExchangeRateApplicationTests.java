package com.example.exchangerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExchangeRateApplicationTests {

    @Test
    void contextLoads() {

        Assertions.assertThat(123).isEqualTo(123);
    }

}
