package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Twice as old",
        url = "https://www.codewars.com/kata/5b853229cfde412a470000d0")
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
