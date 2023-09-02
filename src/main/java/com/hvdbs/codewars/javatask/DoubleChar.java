package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Double Char",
        url = "https://www.codewars.com/kata/56b1f01c247c01db92000076"
)
public class DoubleChar {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)

    public static String doubleChar(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf(s.charAt(i)).repeat(2));
        }

        return sb.toString();
    }
}
