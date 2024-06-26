package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Double Char",
        url = "https://www.codewars.com/kata/56b1f01c247c01db92000076",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class DoubleChar {
    public static String doubleChar(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf(s.charAt(i)).repeat(2));
        }

        return sb.toString();
    }
}
