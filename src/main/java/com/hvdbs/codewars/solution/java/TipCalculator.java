package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Tip Calculator",
        url = "https://www.codewars.com/kata/56598d8076ee7a0759000087"
)
public class TipCalculator {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static Integer calculateTip(double amount, String rating) {
        return switch(rating.toUpperCase()) {
            case "POOR" -> (int)Math.ceil(0.05 * amount);
            case "EXCELLENT" -> (int)Math.ceil(0.2 * amount);
            case "TERRIBLE" -> 0;
            case "GOOD" -> (int)Math.ceil(0.1 * amount);
            case "GREAT" -> (int)Math.ceil(0.15 * amount);
            default -> null;
        };
    }
}
