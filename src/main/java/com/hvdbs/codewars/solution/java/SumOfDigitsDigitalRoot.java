package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SIX,
        name = "Sum of Digits / Digital Root",
        url = "https://www.codewars.com/kata/541c8630095125aba6000c00",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LOGARITHMIC
)
public class SumOfDigitsDigitalRoot {
    public static int digital_root(int n) {
        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        return n;
    }
}
