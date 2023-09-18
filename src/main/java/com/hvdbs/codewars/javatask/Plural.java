package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Plural",
        url = "https://www.codewars.com/kata/52ceafd1f235ce81aa00073a"
)
public class Plural {
    public static boolean isPlural(float f){
        return f != 1;
    }
}
