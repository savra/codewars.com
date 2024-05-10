package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is it even?",
        url = "https://www.codewars.com/kata/555a67db74814aa4ee0001b5"
)
public class IsItEven {
    public boolean isEven(double n) {
        return n % 2 == 0;
    }
}
