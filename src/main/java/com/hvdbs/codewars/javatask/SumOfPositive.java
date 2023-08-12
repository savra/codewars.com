package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sum of positive",
        url = "https://www.codewars.com/kata/5715eaedb436cf5606000381"
)
public class SumOfPositive {
    public static int sum(int[] arr) {
        int result = 0;

        for (int j : arr) {
            if (j > 0) {
                result += j;
            }
        }

        return result;
    }
}
