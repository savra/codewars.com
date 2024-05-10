package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the position!",
        url = "https://www.codewars.com/kata/5808e2006b65bff35500008f")
public class FindThePosition {
    private static final int chrCodeSymbolA = 97;

    public static String position(char alphabet) {
        return "Position of alphabet: " + ((int)alphabet - chrCodeSymbolA + 1);
    }
}
