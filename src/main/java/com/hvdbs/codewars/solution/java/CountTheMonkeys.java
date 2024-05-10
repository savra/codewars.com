package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Count the Monkeys!",
        url = "https://www.codewars.com/kata/56f69d9f9400f508fb000ba7"
)
public class CountTheMonkeys {
    public static int[] monkeyCount(final int n) {
        int[] result = new int[n];

        for (int i = 1, j = 0; j < n; i++, j++) {
            result[j] = i;
        }

        return result;
    }
}
