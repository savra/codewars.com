package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove the time",
        url = "https://www.codewars.com/kata/56b0ff16d4aa33e5bb00008e"
)
public class RemoveTheTime {
    //My Time Complexity: O(m * n)
    //My Space complexity: O(1)
    public static String shortenToDate(String longDate) {
        return longDate.substring(0, longDate.indexOf(","));
    }
}
