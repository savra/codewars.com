package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner - Lost Without a Map",
        url = "https://www.codewars.com/kata/57f781872e3d8ca2a000007e")
public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(value -> value << 1).toArray();
    }
}
