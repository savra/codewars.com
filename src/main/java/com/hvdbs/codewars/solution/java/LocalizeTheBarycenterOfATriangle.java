package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Localize The Barycenter of a Triangle",
        url = "https://www.codewars.com/kata/5601c5f6ba804403c7000004",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class LocalizeTheBarycenterOfATriangle {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        return new double[]{(double) Math.round((x[0] + y[0] + z[0]) / 3 * 10000d) / 10000d,
                (double) Math.round((x[1] + y[1] + z[1]) / 3 * 10000d) / 10000d};
    }
}
