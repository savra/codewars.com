package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] result = new int[]{humanYears, 15, 15};

        if (humanYears >= 2) {
            for (int i = 1; i < result.length; i++) {
                result[i] += 9;
            }

            if (humanYears == 2) {
                return result;
            }

            result[1] += (humanYears - 2) * 4;
            result[2] += (humanYears - 2) * 5;
        }

        return result;
    }
}
