package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Stringy Strings",
        url = "https://www.codewars.com/kata/563b74ddd19a3ad462000054",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append(i % 2 == 0 ? "1" : "0");
        }

        return sb.toString();
    }
}
