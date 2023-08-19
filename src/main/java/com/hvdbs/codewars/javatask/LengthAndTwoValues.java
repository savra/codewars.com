package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
