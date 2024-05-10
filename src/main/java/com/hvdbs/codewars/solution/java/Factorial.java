package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Factorial",
        url = "https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc"
)
public class Factorial {
    public int factorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
