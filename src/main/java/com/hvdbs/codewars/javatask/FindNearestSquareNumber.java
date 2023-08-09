package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        name = "Find Nearest square number",
        difficulty = Difficulty.EIGHT,
        url = "https://www.codewars.com/kata/5a805d8cafa10f8b930005ba"
)
public class FindNearestSquareNumber {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}
