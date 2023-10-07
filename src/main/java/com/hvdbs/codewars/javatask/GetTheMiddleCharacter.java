package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Get the Middle Character",
        url = "https://www.codewars.com/kata/56747fd5cb988479af000028"
)
public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int n = word.length();

        return n % 2 == 0 ? word.substring(n / 2 - 1, n / 2 + 1) : word.substring(n / 2, n / 2 + 1);
    }
}
