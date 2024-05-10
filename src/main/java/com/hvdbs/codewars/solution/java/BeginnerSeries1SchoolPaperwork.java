package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner Series #1 School Paperwork",
        url = "https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class BeginnerSeries1SchoolPaperwork {
    public static int paperWork(int n, int m) {
        if (n < 0 || m < 0) {
            return 0;
        }

        return n * m;
    }
}
