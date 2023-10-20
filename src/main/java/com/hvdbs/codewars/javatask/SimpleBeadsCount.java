package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Simple beads count",
        url = "https://www.codewars.com/kata/58712dfa5c538b6fc7000569"
)
public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        return nBlue == 0 ? 0 : (nBlue - 1) * 2;
    }
}
