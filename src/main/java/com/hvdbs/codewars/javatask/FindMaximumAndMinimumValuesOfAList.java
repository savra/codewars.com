package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find Maximum and Minimum Values of a List",
        url = "https://www.codewars.com/kata/577a98a6ae28071780000989"
)
public class FindMaximumAndMinimumValuesOfAList {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
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
