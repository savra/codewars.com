package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "BeginnerReduceButGrow",
        url = "https://www.codewars.com/kata/57f780909f7e8e3183000078")
public class ReduceButGrow {
    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (x1, x2) -> x1 * x2);
    }
}
