package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert a string to an array",
        url = "https://www.codewars.com/kata/57e76bc428d6fbc2d500036d")
public class ConvertStringToArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
