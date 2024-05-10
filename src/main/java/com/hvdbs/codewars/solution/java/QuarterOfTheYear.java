package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Quarter of the year",
        url = "https://www.codewars.com/kata/5ce9c1000bab0b001134f5af"
)
public class QuarterOfTheYear {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int quarterOf(int month) {
        if (month >= 1 && month <= 3) {
            return 1;
        } else if (month >= 4 && month <= 6) {
            return 2;
        } else if (month >= 7 && month <= 9) {
            return 3;
        } else {
            return 4;
        }
    }
}
