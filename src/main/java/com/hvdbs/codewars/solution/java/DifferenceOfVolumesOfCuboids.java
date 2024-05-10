package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Difference of Volumes of Cuboids",
        url = "https://www.codewars.com/kata/58cb43f4256836ed95000f97")
public class DifferenceOfVolumesOfCuboids {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Math.abs(Arrays.stream(firstCuboid).reduce(1, (a, b) -> a * b) - Arrays.stream(secondCuboid).reduce(1, (a, b) -> a * b));
    }
}
