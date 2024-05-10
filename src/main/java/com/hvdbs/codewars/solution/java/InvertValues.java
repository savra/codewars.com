package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Invert values",
        url = "https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad")
public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(value -> value * -1).toArray();
    }
}
