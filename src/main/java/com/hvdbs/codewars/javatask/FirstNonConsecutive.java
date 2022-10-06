package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }

        return null;
    }
}
