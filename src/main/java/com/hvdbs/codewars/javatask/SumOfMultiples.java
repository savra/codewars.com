package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sum of Multiples",
        url = "https://www.codewars.com/kata/57241e0f440cd279b5000829"
)
public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException();
        }

        long result = 0;

        for (int i = n; i < m; i += n) {
            result += i;
        }

        return result;
    }
}
