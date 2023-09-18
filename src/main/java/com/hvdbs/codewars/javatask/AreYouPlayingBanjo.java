package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Are You Playing Banjo?",
        url = "https://www.codewars.com/kata/53af2b8861023f1d88000832"
)
public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return "r".equalsIgnoreCase(name.substring(0, 1)) ? name +  " plays banjo" : name + " does not play banjo";
    }
}
