package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "BeginnerReduceButGrow",
        url = "https://www.codewars.com/kata/57f780909f7e8e3183000078")
public class ReduceButGrow {
    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (x1, x2) -> x1 * x2);
    }
}
