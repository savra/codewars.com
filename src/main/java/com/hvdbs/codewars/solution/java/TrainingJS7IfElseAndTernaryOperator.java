package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Training JS #7: if..else and ternary operator",
        url = "https://www.codewars.com/kata/57202aefe8d6c514300001fd",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class TrainingJS7IfElseAndTernaryOperator {
    public static int saleHotdogs(final int n) {
        if (n < 5)
            return n * 100;
        else if (n < 10)
            return n * 95;
        else
            return n * 90;
    }
}
