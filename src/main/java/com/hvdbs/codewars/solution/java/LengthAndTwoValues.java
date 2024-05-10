package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Length and two values",
        url = "https://www.codewars.com/kata/62a611067274990047f431a8"
)
public class LengthAndTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];

        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0){
                result[i] = firstValue;
            }
            else {
                result[i] = secondValue;
            }
        }
        return result;
    }
}
