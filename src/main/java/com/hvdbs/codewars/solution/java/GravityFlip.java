package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Collections;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Gravity Flip",
        url = "https://www.codewars.com/kata/5f70c883e10f9e0001c89673"
)
public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            java.util.Arrays.sort(arr);
            return arr;
        } else {
            return java.util.Arrays.stream(arr)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
        }
    }
}
