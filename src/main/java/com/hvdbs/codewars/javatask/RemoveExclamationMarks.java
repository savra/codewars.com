package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove exclamation marks",
        url = "https://www.codewars.com/kata/57a0885cbb9944e24c00008e"
)
public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
