package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "N-th Power (retired)",
        url = "https://www.codewars.com/kata/57d814e4950d8489720008db")
public class NthPower {
    public static int nthPower(int[] array, int n) {
        return array.length > n ? (int)Math.pow(array[n], n) : -1;
    }
}
