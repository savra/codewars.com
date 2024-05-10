package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Pillars",
        url = "https://www.codewars.com/kata/5bb0c58f484fcd170700063d",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class Pillars {
    public static int pillars(int numPill, int dist, int width) {
        if (numPill == 1) {
            return 0;
        }

        return (numPill - 1) * dist * 100 + (numPill * width) - (2 * width);
    }
}
