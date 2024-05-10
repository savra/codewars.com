package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Reversed Strings",
        url = "https://www.codewars.com/kata/5168bb5dfe9a00b126000018"
)
public class ReversedStrings {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
