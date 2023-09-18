package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Even or Odd",
        url = "https://www.codewars.com/kata/53da3dbb4a5168369a0000fe"
)
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
}
