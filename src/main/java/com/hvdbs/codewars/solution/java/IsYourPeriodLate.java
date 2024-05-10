package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is your period late?",
        url = "https://www.codewars.com/kata/578a8a01e9fd1549e50001f1",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class IsYourPeriodLate {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return ChronoUnit.DAYS.between(last, today) > cycleLength;
    }
}
