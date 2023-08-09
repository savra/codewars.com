package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "easy logs",
        url = "https://www.codewars.com/kata/5b68c7029756802aa2000176")
public class EasyLogs {
    public static double logs(double x, double a, double b) {
        return (Math.log(a) / Math.log(x)) + (Math.log(b) / Math.log(x));
    }
}
