package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Remove exclamation marks",
        url = "https://www.codewars.com/kata/57a0885cbb9944e24c00008e"
)
public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
