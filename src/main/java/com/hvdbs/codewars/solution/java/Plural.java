package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Plural",
        url = "https://www.codewars.com/kata/52ceafd1f235ce81aa00073a"
)
public class Plural {
    public static boolean isPlural(float f){
        return f != 1;
    }
}
