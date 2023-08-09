package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the Integral",
        url = "https://www.codewars.com/kata/59811fd8a070625d4c000013")
public class FindTheIntegral {
    public static String integrate(int coefficient, int exponent) {
        return coefficient / (exponent + 1) + "x^" + ++exponent;
    }
}
