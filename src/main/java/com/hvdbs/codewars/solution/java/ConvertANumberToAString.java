package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a Number to a String!",
        url = "https://www.codewars.com/kata/5265326f5fda8eb1160004c8"
)
public class ConvertANumberToAString {
    public static String numberToString(int num) {
        return "" + num;
    }
}
