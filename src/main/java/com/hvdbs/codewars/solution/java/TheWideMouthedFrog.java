package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "The Wide-Mouthed frog!",
        url = "https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89")
public class TheWideMouthedFrog {
    public static String mouthSize(String animal){
        return "alligator".equalsIgnoreCase(animal) ? "small" : "wide";
    }
}
