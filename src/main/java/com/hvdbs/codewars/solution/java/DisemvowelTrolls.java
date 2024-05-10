package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Disemvowel Trolls",
        url = "https://www.codewars.com/kata/52fba66badcd10859f00097e"
)
public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiuoAEIUO]", "");
    }
}
