package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "String repeat",
        url = "https://www.codewars.com/kata/57a0e5c372292dd76d000d7e",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
