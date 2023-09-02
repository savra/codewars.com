package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Regexp Basics - is it a digit?",
        url = "https://www.codewars.com/kata/567bf4f7ee34510f69000032"
)
public class RegexpBasicsIsItAdigit {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static boolean isDigit(String s) {
        return Pattern.compile("[0-9]").matcher(s).matches();
    }
}
