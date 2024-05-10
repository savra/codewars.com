package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner Series #2 Clock",
        url = "https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class BeginnerSeries2Clock {
    public static int Past(int h, int m, int s) {
        return (h * 60 * 60 + m * 60 + s) * 1000;
    }
}
