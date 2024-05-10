package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Count Odd Numbers below n",
        url = "https://www.codewars.com/kata/59342039eb450e39970000a6")
public class CountOddNumbersBelowN {
    public static int oddCount(int n) {
        return n >> 1;
    }
}
