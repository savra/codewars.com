package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
