package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Hex to Decimal",
        url = "https://www.codewars.com/kata/57a4d500e298a7952100035d",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class HexToDecimal {
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }
}
