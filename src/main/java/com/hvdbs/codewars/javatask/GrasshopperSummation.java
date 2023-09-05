package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Summation",
        url = "https://www.codewars.com/kata/55d24f55d7dd296eb9000030"
)
public class GrasshopperSummation {
    public static int summation(int n) {
        if (n == 1) {
            return 1;
        }

        return n % 2 == 0 ? (1 + n) * (n / 2) : (1 + (n - 1)) * ((n - 1) / 2) + n;
    }
}
