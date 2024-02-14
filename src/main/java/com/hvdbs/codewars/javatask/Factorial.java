package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
