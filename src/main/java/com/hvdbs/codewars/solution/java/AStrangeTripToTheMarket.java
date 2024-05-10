package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "A Strange Trip to the Market",
        url = "https://www.codewars.com/kata/55ccdf1512938ce3ac000056",
        timeComplexity = "O(M * N)",
        spaceComplexity = "O(1)"
)
public class AStrangeTripToTheMarket {
    public static boolean isLockNessMonster(String s) {
        return s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty");
    }
}
