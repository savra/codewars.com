package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Array Mean",
        url = "https://www.codewars.com/kata/55d277882e139d0b6000005d"
)
public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        return (int) Arrays.stream(nums).average().orElse(0);
    }
}
