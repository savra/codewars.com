package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is it even?",
        url = "https://www.codewars.com/kata/555a67db74814aa4ee0001b5"
)
public class IsItEven {
    public boolean isEven(double n) {
        return n % 2 == 0;
    }
}
