package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner - Lost Without a Map",
        url = "https://www.codewars.com/kata/57f781872e3d8ca2a000007e")
public class BeginnerLostWithoutAMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(value -> value << 1).toArray();
    }
}
