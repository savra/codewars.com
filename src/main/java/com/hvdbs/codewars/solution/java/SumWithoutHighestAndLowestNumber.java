package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sum without highest and lowest number",
        url = "https://www.codewars.com/kata/576b93db1129fcf2200001e6",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        int sum = 0;
        boolean wasMax = false;
        boolean wasMin = false;

        for (int number : numbers) {
            if (number != min && number != max) {
                sum += number;
            }

            if (number == max) {
                if (wasMax) {
                    sum += number;
                }

                wasMax = true;
            }

            if (number == min) {
                if (wasMin) {
                    sum += number;
                }

                wasMin = true;
            }
        }

        return sum;
    }
}
