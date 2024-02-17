package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
