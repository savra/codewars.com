package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        int twiceSonYears = sonYears << 1;

        if (dadYears > twiceSonYears) {
            return dadYears - twiceSonYears;
        } else {
            return twiceSonYears - dadYears;
        }
    }
}
