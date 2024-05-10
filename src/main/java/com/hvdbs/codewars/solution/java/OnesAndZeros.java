package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
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
