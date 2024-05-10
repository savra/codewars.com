package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "How old will I be in 2099?",
        url = "https://www.codewars.com/kata/5761a717780f8950ce001473",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class HowOldWillIBeIn2099 {
    public static String CalculateAge(int birth, int yearTo) {
        int diff = yearTo - birth;
        String result = "";

        if (diff > 0) {
            String year = diff == 1 ? " year" : " years";
            result = "You are " + (yearTo - birth) + year + " old.";
        } else if (diff == 0) {
            result = "You were born this very year!";
        } else {
            String year = (Math.abs(diff) == 1 ? " year." : " years.");
            result = "You will be born in " + Math.abs(diff) + year;
        }


        return result;
    }
}
