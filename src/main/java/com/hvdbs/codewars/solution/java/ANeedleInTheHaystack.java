package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "A Needle in the Haystack",
        url = "https://www.codewars.com/kata/56676e8fabd2d1ff3000000c"
)
public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String) {
                if (haystack[i] == "needle") {
                    return "found the needle at position " + i;
                }
            }
        }

        return "";
    }
}
