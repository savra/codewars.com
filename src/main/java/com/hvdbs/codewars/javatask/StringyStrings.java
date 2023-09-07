package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Stringy Strings",
        url = "https://www.codewars.com/kata/563b74ddd19a3ad462000054"
)
public class StringyStrings {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String stringy(int size) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            sb.append(i % 2 == 0 ? "1" : "0");
        }

        return sb.toString();
    }
}
