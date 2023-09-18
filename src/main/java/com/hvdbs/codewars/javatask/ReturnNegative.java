package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Return Negative",
        url = "https://www.codewars.com/kata/55685cd7ad70877c23000102"
)
public class ReturnNegative {
    public static int makeNegative(final int x) {
        return x <= 0 ? x : -x;
    }
}
