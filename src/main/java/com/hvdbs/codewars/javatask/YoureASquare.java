package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "You're a square!",
        url = "https://www.codewars.com/kata/54c27a33fb7da0db0100040e"
)
public class YoureASquare {
    public static boolean isSquare(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}
