package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Exclusive \"or\" (xor) Logical Operator",
        url = "https://www.codewars.com/kata/56fa3c5ce4d45d2a52001b3c",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class ExclusiveOrXorLogicalOperator {
    public static boolean xor(boolean a, boolean b) {
        return a ^ b;
    }
}
