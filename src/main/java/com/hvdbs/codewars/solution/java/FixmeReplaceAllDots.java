package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "FIXME: Replace all dots",
        url = "https://www.codewars.com/kata/596c6eb85b0f515834000049")
public class FixmeReplaceAllDots {
    public static String replaceDots(final String str) {
        return str.replaceAll("[.]", "-");
    }
}
