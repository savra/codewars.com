package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Find Multiples of a Number",
        url = "https://www.codewars.com/kata/58ca658cc0d6401f2700045f")
public class FindMultiplesOfANumber {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)

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
