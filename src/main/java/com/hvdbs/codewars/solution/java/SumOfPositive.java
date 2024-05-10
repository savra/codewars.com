package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sum of positive",
        url = "https://www.codewars.com/kata/5715eaedb436cf5606000381"
)
public class SumOfPositive {
    public static int sum(int[] arr) {
        int result = 0;

        for (int j : arr) {
            if (j > 0) {
                result += j;
            }
        }

        return result;
    }
}
