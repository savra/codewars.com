package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove First and Last Character",
        url = "https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0"
)
public class RemoveFirstAndLastCharacter {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}
