package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Check for factor",
        url = "https://www.codewars.com/kata/55cbc3586671f6aa070000fb"
)
public class GrasshopperCheckForFactor {
    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }
}
