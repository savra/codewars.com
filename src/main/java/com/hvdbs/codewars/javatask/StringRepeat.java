package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "String repeat",
        url = "https://www.codewars.com/kata/57a0e5c372292dd76d000d7e"
)
public class StringRepeat {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
