package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a string to an array",
        url = "https://www.codewars.com/kata/57e76bc428d6fbc2d500036d")
public class ConvertStringToArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
