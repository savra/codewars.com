package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Basic Function Fixer",
        url = "https://www.codewars.com/kata/56200d610758762fb0000002"
)
public class GrasshopperBasicFunctionFixer {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int addFive(int num) {
        return num + 5;
    }
}
