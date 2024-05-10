package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Reversed Strings",
        url = "https://www.codewars.com/kata/5168bb5dfe9a00b126000018",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class ReversedStrings {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
