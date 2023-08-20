package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Pillars",
        url = "https://www.codewars.com/kata/5bb0c58f484fcd170700063d"
)
public class Pillars {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int pillars(int numPill, int dist, int width) {
        if (numPill == 1) {
            return 0;
        }

        return (numPill - 1) * dist * 100 + (numPill * width) - (2 * width);
    }
}
