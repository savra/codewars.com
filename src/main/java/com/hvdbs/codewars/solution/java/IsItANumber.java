package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is it a number?",
        url = "https://www.codewars.com/kata/57126304cdbf63c6770012bd")
public class IsItANumber {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public boolean isDigit(String s) {
        boolean isDigit;

        try {
            Long.parseLong(s);
        } catch (NumberFormatException ignored) {
        }

        try {
            Double.parseDouble(s);
            isDigit = true;
        } catch (NumberFormatException e) {
            isDigit = false;
        }

        return isDigit;
    }
}
