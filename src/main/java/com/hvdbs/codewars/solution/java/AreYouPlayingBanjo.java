package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Are You Playing Banjo?",
        url = "https://www.codewars.com/kata/53af2b8861023f1d88000832"
)
public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return "r".equalsIgnoreCase(name.substring(0, 1)) ? name +  " plays banjo" : name + " does not play banjo";
    }
}
