package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the smallest integer in the array",
        url = "https://www.codewars.com/kata/55a2d7ebe362935a210000b2"
)
public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;

        for (int arg : args) {
            if (arg < min) {
                min = arg;
            }
        }

        return min;
    }
}
