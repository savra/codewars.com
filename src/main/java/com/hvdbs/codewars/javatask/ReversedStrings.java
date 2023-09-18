package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Reversed Strings",
        url = "https://www.codewars.com/kata/5168bb5dfe9a00b126000018"
)
public class ReversedStrings {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
