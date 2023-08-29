package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is it a number?",
        url = "https://www.codewars.com/kata/57126304cdbf63c6770012bd")
public class IsItANumber {
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
