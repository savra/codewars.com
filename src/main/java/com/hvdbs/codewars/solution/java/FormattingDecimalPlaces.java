package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Formatting decimal places",
        url = "https://www.codewars.com/kata/5641a03210e973055a00000d",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class FormattingDecimalPlaces {
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number*100) / 100.0;
    }
}
