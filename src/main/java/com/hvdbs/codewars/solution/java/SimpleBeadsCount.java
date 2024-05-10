package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Simple beads count",
        url = "https://www.codewars.com/kata/58712dfa5c538b6fc7000569"
)
public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        return nBlue == 0 ? 0 : (nBlue - 1) * 2;
    }
}
