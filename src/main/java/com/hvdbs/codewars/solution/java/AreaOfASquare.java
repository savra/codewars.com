package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Area of a Square",
        url = "https://www.codewars.com/kata/5748838ce2fab90b86001b1a"
)
public class AreaOfASquare {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static double squareArea(double A){
        double l = A * 4;
        double r = l / (2 * Math.PI);

        return Math.round(Math.pow(r, 2) * 100.0) / 100.0;
    }
}
