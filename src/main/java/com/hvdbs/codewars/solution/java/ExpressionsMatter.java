package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Expressions Matter",
        url = "https://www.codewars.com/kata/5ae62fcf252e66d44d00008e",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        int maxValue;

        int t1 = a * b * c;
        int t2 = a + b + c;
        int t3 = a + b * c;
        int t4 = a * b + c;
        int t5 = (a + b) * c;
        int t6 = a * (b + c);

        maxValue = Math.max(t1, t2);
        maxValue = Math.max(maxValue, t3);
        maxValue = Math.max(maxValue, t4);
        maxValue = Math.max(maxValue, t5);
        maxValue = Math.max(maxValue, t6);

        return maxValue;
    }
}
