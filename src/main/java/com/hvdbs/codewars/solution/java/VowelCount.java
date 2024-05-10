package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Vowel Count",
        difficulty = Difficulty.SEVEN,
        url = "https://www.codewars.com/kata/54ff3102c1bad923760001f3")
public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;

        vowelsCount = java.util.regex.Pattern.compile("[^aeiou]").matcher(str).replaceAll("").length();

        return vowelsCount;
    }
}
