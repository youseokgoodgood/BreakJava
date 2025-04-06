package com.example.unitTest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName    : com.example.unitTest
 * fileName       : SimpleCalculatorTest
 * author         : wnsgh
 * date           : 2025-03-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-19        wnsgh       최초 생성
 */
class SimpleCalculatorTest {

    @Test
    void simpleCalculatorTest() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertThat(calculator.add(1, 2)).isEqualTo(4);
    }

}