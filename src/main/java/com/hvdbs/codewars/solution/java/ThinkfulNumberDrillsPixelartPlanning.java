package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Thinkful - Number Drills: Pixelart planning (retired)",
        url = "https://www.codewars.com/kata/58630e2ae88af44d2b0000ea")
public class ThinkfulNumberDrillsPixelartPlanning {
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }
}
