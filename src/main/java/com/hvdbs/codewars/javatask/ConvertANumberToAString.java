package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a Number to a String!",
        url = "https://www.codewars.com/kata/5265326f5fda8eb1160004c8"
)
public class ConvertANumberToAString {
    public static String numberToString(int num) {
        return "" + num;
    }
}
