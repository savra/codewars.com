package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find the first non-consecutive number",
        url = "https://www.codewars.com/kata/58f8a3a27a5c28d92e000144")
public class FindTheFirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }

        return null;
    }
}
