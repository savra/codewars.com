package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Number-Star ladder",
        url = "https://www.codewars.com/kata/5631213916d70a0979000066")
public class NumberStarLadder {
    public static String pattern(int n) {
        if (n == 1) {
            return "1";
        }

        StringBuilder result = new StringBuilder();
        result.append("1\n");

        for (int i = 1; i < n; i++) {
            int j = i;
            result.append("1");

            while (j > 0) {
                result.append("*");
                j--;
            }

            result.append(i + 1);

            if (i != n - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
