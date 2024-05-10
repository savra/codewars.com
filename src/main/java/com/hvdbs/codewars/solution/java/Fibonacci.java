package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Fibonacci",
        url = "https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af")
public class Fibonacci {
    public static long fib(int n) {
        if (n <= 2) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }
}
