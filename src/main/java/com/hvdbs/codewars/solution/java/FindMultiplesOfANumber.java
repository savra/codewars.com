package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find Multiples of a Number",
        url = "https://www.codewars.com/kata/58ca658cc0d6401f2700045f",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class FindMultiplesOfANumber {
    public static int[] find(int base, int limit) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        int tmp = base;

        while (tmp <= limit) {
            result.add(tmp);
            tmp += base;
        }

        return result.stream().mapToInt(v -> v).toArray();
    }
}
