package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a String to a Number!",
        url = "https://www.codewars.com/kata/544675c6f971f7399a000e79"
)
public class ConvertAStringToANumber {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
