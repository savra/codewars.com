package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Localize The Barycenter of a Triangle",
        url = "https://www.codewars.com/kata/5601c5f6ba804403c7000004"
)
public class LocalizeTheBarycenterOfATriangle {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        return new double[]{(double) Math.round((x[0] + y[0] + z[0]) / 3 * 10000d) / 10000d,
                (double) Math.round((x[1] + y[1] + z[1]) / 3 * 10000d) / 10000d};
    }
}
