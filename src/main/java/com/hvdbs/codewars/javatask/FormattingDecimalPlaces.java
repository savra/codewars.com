package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Formatting decimal places",
        url = "https://www.codewars.com/kata/5641a03210e973055a00000d"
)
public class FormattingDecimalPlaces {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number*100) / 100.0;
    }
}
