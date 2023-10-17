package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Compare Strings by Sum of Chars",
        url = "https://www.codewars.com/kata/576bb3c4b1abc497ec000065"
)
public class CompareStringsBySumOfChars {
    public static boolean compare(String s1, String s2) {
        if (s1 == null || s1.isEmpty()) {
            s1 = "";
        }

        if (s2 == null || s2.isEmpty()) {
            s2 = "";
        }

        int sum1 = findSum(s1.toUpperCase());
        int sum2 = findSum(s2.toUpperCase());

        return sum1 == sum2;
    }

    private static int findSum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i);

            if ((tmp >= 65 && tmp <= 90) || (tmp >= 97 && tmp <= 122)) {
                sum += tmp;
            } else {
                sum = 0;
                break;
            }
        }
        return sum;
    }
}
