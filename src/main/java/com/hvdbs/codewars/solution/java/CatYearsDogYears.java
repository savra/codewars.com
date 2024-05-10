package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Cat years, Dog years",
        url = "https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b")
public class CatYearsDogYears {
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
