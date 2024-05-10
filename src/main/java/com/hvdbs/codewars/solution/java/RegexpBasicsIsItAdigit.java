package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Regexp Basics - is it a digit?",
        url = "https://www.codewars.com/kata/567bf4f7ee34510f69000032",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class RegexpBasicsIsItAdigit {
    public static boolean isDigit(String s) {
        return Pattern.compile("[0-9]").matcher(s).matches();
    }
}
