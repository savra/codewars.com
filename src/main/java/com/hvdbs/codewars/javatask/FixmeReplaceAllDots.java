package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "FIXME: Replace all dots",
        url = "https://www.codewars.com/kata/596c6eb85b0f515834000049")
public class FixmeReplaceAllDots {
    public static String replaceDots(final String str) {
        return str.replaceAll("[.]", "-");
    }
}
