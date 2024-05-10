package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Collatz Conjecture Length",
        url = "https://www.codewars.com/kata/54fb963d3fe32351f2000102"
)
public class CollatzConjectureLength {
    public static long conjecture(long x) {
        int result = 0;

        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = x * 3 + 1;
            }

            result++;
        }

        return result + 1;
    }
}
