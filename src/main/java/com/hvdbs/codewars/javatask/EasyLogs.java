package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class EasyLogs {
    public static double logs(double x, double a, double b) {
        return (Math.log(a) / Math.log(x)) + (Math.log(b) / Math.log(x));

    }
}
