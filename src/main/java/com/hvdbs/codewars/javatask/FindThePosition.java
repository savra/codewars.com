package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the position!",
        url = "https://www.codewars.com/kata/5808e2006b65bff35500008f")
public class FindThePosition {
    private static final int chrCodeSymbolA = 97;

    public static String position(char alphabet) {
        return "Position of alphabet: " + ((int)alphabet - chrCodeSymbolA + 1);
    }
}
