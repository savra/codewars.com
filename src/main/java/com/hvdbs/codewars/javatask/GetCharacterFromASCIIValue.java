package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "get character from ASCII Value",
        url = "https://www.codewars.com/kata/55ad04714f0b468e8200001c"
)
public class GetCharacterFromASCIIValue {
    public static char getChar(int c) {
        return (char) c;
    }
}
