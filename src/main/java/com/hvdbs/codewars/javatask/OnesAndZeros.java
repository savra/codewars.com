package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.List;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Ones and Zeros",
        url = "https://www.codewars.com/kata/578553c3a1b8d5c40300037c"
)
public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int res = 0;
        int k = binary.size() - 1;

        for (int i : binary) {
            if (i == 1) {
                res += Math.pow(2, k);
            }

            k--;
        }

        return res;
    }
}
