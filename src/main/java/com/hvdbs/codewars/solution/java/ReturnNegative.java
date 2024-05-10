package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Return Negative",
        url = "https://www.codewars.com/kata/55685cd7ad70877c23000102"
)
public class ReturnNegative {
    public static int makeNegative(final int x) {
        return x <= 0 ? x : -x;
    }
}
