package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Collections;

@CodewarsInfo(
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
