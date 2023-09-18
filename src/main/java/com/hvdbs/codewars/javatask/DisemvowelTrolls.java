package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Disemvowel Trolls",
        url = "https://www.codewars.com/kata/52fba66badcd10859f00097e"
)
public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiuoAEIUO]", "");
    }
}
