package com.example.unitTest;

/**
 * packageName    : com.example.unitTest
 * fileName       : Grader
 * author         : wnsgh
 * date           : 2025-03-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-19        wnsgh       최초 생성
 */
public class Grader {

    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number grade cannot be negative");
        }
        else if (numberGrade < 60) {
          return 'F';
        }
        else if (numberGrade < 70) {
            return 'D';
        }
        else if (numberGrade < 80) {
            return 'C';
        }
        else if (numberGrade < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
