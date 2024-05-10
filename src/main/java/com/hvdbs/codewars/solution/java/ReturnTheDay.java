package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Return the day",
        url = "https://www.codewars.com/kata/59dd3ccdded72fc78b000b25"
)
public class ReturnTheDay {
    public static String getDay(int n) {
        return switch (n) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Wrong, please enter a number between 1 and 7";
        };
    }
}
