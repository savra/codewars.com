package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a String to a Number!",
        url = "https://www.codewars.com/kata/544675c6f971f7399a000e79"
)
public class ConvertAStringToANumber {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
