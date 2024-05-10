package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Opposites Attract",
        url = "https://www.codewars.com/kata/555086d53eac039a2a000083",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return !(Math.abs(flower1 - flower2) % 2 == 0);
    }
}
