package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "A Strange Trip to the Market",
        url = "https://www.codewars.com/kata/55ccdf1512938ce3ac000056"
)
public class AStrangeTripToTheMarket {
    //My Time Complexity: O(m * n)
    //My Space complexity: O(1)
    public static boolean isLockNessMonster(String s){
        return s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty");
    }
}
