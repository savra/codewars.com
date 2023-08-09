package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Thinkful - Number Drills: Pixelart planning (retired)",
        url = "https://www.codewars.com/kata/58630e2ae88af44d2b0000ea")
public class ThinkfulNumberDrillsPixelartPlanning {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
}
