package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Area of a Square",
        url = "https://www.codewars.com/kata/5748838ce2fab90b86001b1a",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)"
)
public class AreaOfASquare {
    public static double squareArea(double A) {
        double l = A * 4;
        double r = l / (2 * Math.PI);

        return Math.round(Math.pow(r, 2) * 100.0) / 100.0;
    }
}
