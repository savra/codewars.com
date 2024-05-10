package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Simple validation of a username with regex",
        url = "https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023"
)
public class SimpleValidationOfAUsernameWithRegex {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)

    public static boolean validateUsr(String s) {
        return Pattern.compile("([a-z]|[0-9]|_){4,16}").matcher(s).matches();
    }
}
