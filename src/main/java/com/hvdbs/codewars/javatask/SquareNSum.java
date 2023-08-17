package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Square(n) Sum",
        url = "https://www.codewars.com/kata/515e271a311df0350d00000f"
)
public class SquareNSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).reduce(0, (a, b) -> a + b * b);
    }
}
