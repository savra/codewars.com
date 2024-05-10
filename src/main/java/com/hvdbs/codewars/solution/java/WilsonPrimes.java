package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.math.BigDecimal;
import java.math.RoundingMode;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Wilson primes",
        url = "https://www.codewars.com/kata/55dc4520094bbaf50e0000cb",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class WilsonPrimes {
    public static boolean am_i_wilson(double n) {
        if (n == 0 || n == 1) {
            return false;
        }

        BigDecimal result = factorial(BigDecimal.valueOf(n - 1))
                .add(BigDecimal.ONE)
                .divide(BigDecimal.valueOf(n * n), RoundingMode.UP);

        return result.stripTrailingZeros().scale() == 0;
    }

    private static BigDecimal factorial(BigDecimal n) {
        if (n.intValue() <= 1) {
            return n;
        }

        return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
    }
}
