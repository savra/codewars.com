package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the Integral",
        url = "https://www.codewars.com/kata/59811fd8a070625d4c000013")
public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        return coefficient / (exponent + 1) + "x^" + ++exponent;
    }
}
