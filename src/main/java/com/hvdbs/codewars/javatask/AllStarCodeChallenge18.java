package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "All Star Code Challenge #18",
        url = "https://www.codewars.com/kata/5865918c6b569962950002a1")
public class AllStarCodeChallenge18 {
    public static int strCount(String str, char letter) {
        return str.length() - str.replaceAll(String.valueOf(letter), "").length();
    }
}
