package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is your period late?",
        url = "https://www.codewars.com/kata/578a8a01e9fd1549e50001f1"
)
public class IsYourPeriodLate {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return ChronoUnit.DAYS.between(last, today) > cycleLength;
    }
}
