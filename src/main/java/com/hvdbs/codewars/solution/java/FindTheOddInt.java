package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SIX,
        name = "Find the odd int",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        url = " https://www.codewars.com/kata/54da5a58ea159efa38000836 "
)
public class FindTheOddInt {
    public static int findIt(int[] a) {
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            res ^= a[i];
        }
        return res;
    }
}
