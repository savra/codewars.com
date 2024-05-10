package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Debug Sum of Digits of a Number",
        url = "https://www.codewars.com/kata/563d59dd8e47a5ed220000ba"
)
public class DebugSumOfDigitsOfANumber {
    public static int sumOfDigits(int n) {
        int sum = 0;
        String digits = n + "";

        for (int i = 0; i < digits.length(); i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }

        return sum;
    }
}
