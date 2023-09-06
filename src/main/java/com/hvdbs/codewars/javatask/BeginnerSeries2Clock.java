package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner Series #2 Clock",
        url = "https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a"
)
public class BeginnerSeries2Clock {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int Past(int h, int m, int s) {
        return (h * 60 * 60 + m * 60 + s) * 1000;
    }
}
