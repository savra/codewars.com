package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a Boolean to a String",
        url = "https://www.codewars.com/kata/551b4501ac0447318f0009cd"
)
public class ConvertABooleanToAString {
    public static String convert(boolean b) {
        return String.valueOf(b);
    }
}
