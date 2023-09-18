package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Vowel remover",
        url = "https://www.codewars.com/kata/5547929140907378f9000039"
)
public class VowelRemover {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiuo]", "");
    }
}
