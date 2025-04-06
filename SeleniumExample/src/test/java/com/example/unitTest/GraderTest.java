package com.example.unitTest;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


/**
 * packageName    : com.example.unitTest
 * fileName       : GraderTest
 * author         : wnsgh
 * date           : 2025-03-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-19        wnsgh       최초 생성
 */
class GraderTest {

    @Test
    void graderTest() {
        Grader grader = new Grader();
        assertThat(grader.determineLetterGrade(99)).isEqualTo('A');
    }

}