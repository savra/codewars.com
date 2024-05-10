package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Array Mean",
        url = "https://www.codewars.com/kata/55d277882e139d0b6000005d"
)
public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        return (int) Arrays.stream(nums).average().orElse(0);
    }
}
