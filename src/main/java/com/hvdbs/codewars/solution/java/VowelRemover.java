package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Vowel remover",
        url = "https://www.codewars.com/kata/5547929140907378f9000039"
)
public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiuo]", "");
    }
}
