package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Bin to Decimal",
        url = "https://www.codewars.com/kata/57a5c31ce298a7e6b7000334",
        spaceComplexity = "O(N)",
        timeComplexity = "O(1)")
public class BinToDecimal {
    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);
    }
}
