package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
