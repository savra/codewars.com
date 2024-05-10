package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove String Spaces",
        url = "https://www.codewars.com/kata/57eae20f5500ad98e50002c5")
public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replaceAll("[ ]", "");
    }
}
