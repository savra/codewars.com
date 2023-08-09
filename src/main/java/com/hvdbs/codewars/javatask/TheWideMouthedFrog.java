package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "The Wide-Mouthed frog!",
        url = "https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89")
public class TheWideMouthedFrog {
    public static String mouthSize(String animal){
        return "alligator".equalsIgnoreCase(animal) ? "small" : "wide";
    }
}
