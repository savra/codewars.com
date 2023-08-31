package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Exclusive \"or\" (xor) Logical Operator",
        url = "https://www.codewars.com/kata/56fa3c5ce4d45d2a52001b3c"
)
public class ExclusiveOrXorLogicalOperator {
    public static boolean xor(boolean a, boolean b) {
        return a ^ b;
    }
}
