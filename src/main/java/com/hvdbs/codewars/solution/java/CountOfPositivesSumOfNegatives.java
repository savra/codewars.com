package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Count of positives / sum of negatives",
        url = "https://www.codewars.com/kata/576bb71bbbcf0951d5000044"
)
public class CountOfPositivesSumOfNegatives {
    //My Time Complexity: O(n)
    //My Auxiliary Space: O(1)
    public static int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];

        if (input == null || input.length == 0) {
            return new int[0];
        }

        for (int j : input) {
            if (j > 0) {
                result[0]++;
            } else if (j < 0) {
                result[1] += j;
            }
        }

        return result;
    }
}
