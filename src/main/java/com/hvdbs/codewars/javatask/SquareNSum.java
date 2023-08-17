package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Square(n) Sum",
        url = ""
)
public class SquareNSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).reduce(0, (a, b) -> a + b * b);
    }
}
