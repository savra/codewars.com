package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Count by X",
        url = "https://www.codewars.com/kata/5513795bd3fafb56c200049e"
)
public class CountByX {
    public static int[] countBy(int x, int n){
        int[] result = new int[n];

        for (int i = 1, j= 0; j < n; i++, j++) {
            result[j] = i * x;
        }

        return result;
    }
}
