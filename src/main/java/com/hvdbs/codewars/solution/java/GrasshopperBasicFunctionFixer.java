package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Basic Function Fixer",
        url = "https://www.codewars.com/kata/56200d610758762fb0000002",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class GrasshopperBasicFunctionFixer {
    public static int addFive(int num) {
        return num + 5;
    }
}
