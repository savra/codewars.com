package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Expressions Matter",
        url = "https://www.codewars.com/kata/5ae62fcf252e66d44d00008e"
)
public class ExpressionsMatter {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
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
