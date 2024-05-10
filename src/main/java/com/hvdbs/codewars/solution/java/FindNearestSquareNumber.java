package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Find Nearest square number",
        difficulty = Difficulty.EIGHT,
        url = "https://www.codewars.com/kata/5a805d8cafa10f8b930005ba"
)
public class FindNearestSquareNumber {
    public static int nearestSq(final int n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }
}
