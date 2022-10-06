package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class ReplaceAllVowel {
    public static String replace(final String s) {
        return Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE).matcher(s).replaceAll("!");
    }
}
