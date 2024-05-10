package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove the time",
        url = "https://www.codewars.com/kata/56b0ff16d4aa33e5bb00008e",
        spaceComplexity = "O(1)",
        timeComplexity = "O(M * N)")
public class RemoveTheTime {
    public static String shortenToDate(String longDate) {
        return longDate.substring(0, longDate.indexOf(","));
    }
}
