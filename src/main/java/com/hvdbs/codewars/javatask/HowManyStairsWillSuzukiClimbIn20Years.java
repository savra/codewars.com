package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
