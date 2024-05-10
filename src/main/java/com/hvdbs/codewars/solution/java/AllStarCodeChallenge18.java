package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "All Star Code Challenge #18",
        url = "https://www.codewars.com/kata/5865918c6b569962950002a1")
public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        return str.length() - str.replaceAll(String.valueOf(letter), "").length();
    }
}
