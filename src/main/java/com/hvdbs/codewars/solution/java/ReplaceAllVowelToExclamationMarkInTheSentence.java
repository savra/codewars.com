package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence",
        url = "https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed")
public class ReplaceAllVowelToExclamationMarkInTheSentence {
    public static String replace(final String s) {
        return Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE).matcher(s).replaceAll("!");
    }
}
