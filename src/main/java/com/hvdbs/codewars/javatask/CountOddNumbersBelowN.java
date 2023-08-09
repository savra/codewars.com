package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Count Odd Numbers below n",
        url = "https://www.codewars.com/kata/59342039eb450e39970000a6")
public class CountOddNumbersBelowN {
    public static int oddCount(int n) {
        return n >> 1;
    }
}
