package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "L1: Set Alarm",
        url = "https://www.codewars.com/kata/568dcc3c7f12767a62000038"
)
public class L1SetAlarm {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed && !vacation;
    }
}
