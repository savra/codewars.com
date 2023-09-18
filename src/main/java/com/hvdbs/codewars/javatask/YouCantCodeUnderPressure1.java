package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "You Can't Code Under Pressure #1",
        url = "https://www.codewars.com/kata/53ee5429ba190077850011d4"
)
public class YouCantCodeUnderPressure1 {
    public static int doubleInteger(int i) {
        return i * i;
    }
}
