package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "How many stairs will Suzuki climb in 20 years?",
        url = "https://www.codewars.com/kata/56fc55cd1f5a93d68a001d4e"
)
public class HowManyStairsWillSuzukiClimbIn20Years {
    public static long stairsIn20(int[][] stairs) {
        int yearTotal = 0;

        for (int[] week : stairs) {
            for (int day : week) {
                yearTotal += day;
            }
        }

        return yearTotal * 20L;
    }
}
