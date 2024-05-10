package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find Maximum and Minimum Values of a List",
        url = "https://www.codewars.com/kata/577a98a6ae28071780000989",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class FindMaximumAndMinimumValuesOfAList {
    public int min(int[] list) {
        int min = Integer.MAX_VALUE;

        for (int j : list) {
            if (j < min) {
                min = j;
            }
        }

        return min;
    }

    public int max(int[] list) {
        int max = Integer.MIN_VALUE;

        for (int j : list) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }
}
