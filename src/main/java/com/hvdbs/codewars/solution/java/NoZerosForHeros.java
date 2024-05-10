package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "No zeros for heros",
        url = "https://www.codewars.com/kata/570a6a46455d08ff8d001002"
)
public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        int tmp = n;

        while (Math.abs(n) > 1) {
            tmp = n % 10;

            if (tmp != 0) {
                return n;
            }

            n /= 10;
        }

        return n < 0 ? -tmp: tmp;
    }
}
