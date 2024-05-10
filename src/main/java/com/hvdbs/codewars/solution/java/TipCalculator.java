package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Tip Calculator",
        url = "https://www.codewars.com/kata/56598d8076ee7a0759000087",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        return switch (rating.toUpperCase()) {
            case "POOR" -> (int) Math.ceil(0.05 * amount);
            case "EXCELLENT" -> (int) Math.ceil(0.2 * amount);
            case "TERRIBLE" -> 0;
            case "GOOD" -> (int) Math.ceil(0.1 * amount);
            case "GREAT" -> (int) Math.ceil(0.15 * amount);
            default -> null;
        };
    }
}
