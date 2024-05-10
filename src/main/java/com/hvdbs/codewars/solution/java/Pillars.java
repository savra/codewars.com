package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
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
