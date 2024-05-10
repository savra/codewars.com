package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Summation",
        url = "https://www.codewars.com/kata/55d24f55d7dd296eb9000030",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class GrasshopperSummation {
    public static int summation(int n) {
        if (n == 1) {
            return 1;
        }

        return n % 2 == 0 ? (1 + n) * (n / 2) : (1 + (n - 1)) * ((n - 1) / 2) + n;
    }
}
