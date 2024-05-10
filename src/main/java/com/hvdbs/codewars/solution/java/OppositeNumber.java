package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Opposite number",
        url = "https://www.codewars.com/kata/56dec885c54a926dcd001095",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class OppositeNumber {
    public static int opposite(int number) {
        return -number;
    }
}
