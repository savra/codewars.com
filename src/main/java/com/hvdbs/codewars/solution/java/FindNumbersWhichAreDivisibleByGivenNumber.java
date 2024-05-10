package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find numbers which are divisible by given number",
        url = "https://www.codewars.com/kata/55edaba99da3a9c84000003b"
)
public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();

        for (int number : numbers) {
            if (number % divider == 0) {
                result.add(number);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
