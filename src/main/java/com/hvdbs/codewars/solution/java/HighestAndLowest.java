package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Highest and Lowest",
        url = "https://www.codewars.com/kata/554b4ac871d6813a03000035"
)
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String[] source = numbers.split(" ");

        for (String s : source) {
            int c = Integer.parseInt(s);

            if (c > max) {
                max = c;
            }

            if (c < min) {
                min = c;
            }
        }

        return "" + max + " " + min;
    }
}
