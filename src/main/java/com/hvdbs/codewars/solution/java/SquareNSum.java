package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Square(n) Sum",
        url = "https://www.codewars.com/kata/515e271a311df0350d00000f"
)
public class SquareNSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).reduce(0, (a, b) -> a + b * b);
    }
}
