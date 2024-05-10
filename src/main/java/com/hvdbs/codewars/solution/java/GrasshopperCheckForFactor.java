package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Check for factor",
        url = "https://www.codewars.com/kata/55cbc3586671f6aa070000fb"
)
public class GrasshopperCheckForFactor {
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
