package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Invert values",
        url = "https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad")
public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(value -> value * -1).toArray();
    }
}
