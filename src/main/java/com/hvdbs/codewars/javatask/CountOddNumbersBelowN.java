package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class CountOddNumbersBelowN {
    public static int oddCount(int n) {
        return n >> 1;
    }

    public static void main(String[] args) {
        System.out.println(oddCount(1502305757));
    }
}
