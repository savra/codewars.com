package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the Slope",
        url = "https://www.codewars.com/kata/55a75e2d0803fea18f00009d"
)
public class FindTheSlope {
    public String slope(int[] points) {
        double divisor = points[3] - points[1];
        double dividend = points[2] - points[0];

        if (dividend == 0) {
            return "undefined";
        } else {
            return String.valueOf((int)(divisor / dividend));
        }
    }
}
