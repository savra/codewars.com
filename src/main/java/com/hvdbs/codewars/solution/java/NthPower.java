package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "N-th Power (retired)",
        url = "https://www.codewars.com/kata/57d814e4950d8489720008db")
public class NthPower {
    public static int nthPower(int[] array, int n) {
        return array.length > n ? (int)Math.pow(array[n], n) : -1;
    }
}
