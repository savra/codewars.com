package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sum Arrays",
        url = "https://www.codewars.com/kata/53dc54212259ed3d4f00071c"
)
public class SumArrays {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).reduce(0, Double::sum);
    }
}
