package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Number of Decimal Digits",
        url = "https://www.codewars.com/kata/58fa273ca6d84c158e000052")
public class NumberOfDecimalDigits {
    public static int Digits(long n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }
}
