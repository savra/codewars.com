package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove String Spaces",
        url = "https://www.codewars.com/kata/57eae20f5500ad98e50002c5")
public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replaceAll("[ ]", "");
    }
}
