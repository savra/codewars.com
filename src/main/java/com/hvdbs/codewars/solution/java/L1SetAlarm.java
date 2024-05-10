package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "L1: Set Alarm",
        url = "https://www.codewars.com/kata/568dcc3c7f12767a62000038",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class L1SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
