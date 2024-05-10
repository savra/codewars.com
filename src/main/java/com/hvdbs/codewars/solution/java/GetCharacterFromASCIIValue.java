package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "get character from ASCII Value",
        url = "https://www.codewars.com/kata/55ad04714f0b468e8200001c"
)
public class GetCharacterFromASCIIValue {
    public static char getChar(int c) {
        return (char) c;
    }
}
