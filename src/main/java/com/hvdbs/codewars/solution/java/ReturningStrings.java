package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Returning Strings",
        url = "https://www.codewars.com/kata/55a70521798b14d4750000a4"
)
public class ReturningStrings {
    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }
}
