package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "FIXME: Hours to Seconds",
        url = "https://www.codewars.com/kata/596b041e224071ece200002e"
)
public class FIXMEHoursToSeconds {
    public static long hoursToSeconds(final int hours) {
        return hours * 60 * 60L;
    }
}
