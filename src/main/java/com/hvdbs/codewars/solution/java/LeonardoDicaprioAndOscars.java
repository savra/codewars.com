package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Leonardo Dicaprio and Oscars",
        url = "https://www.codewars.com/kata/56d49587df52101de70011e4"
)
public class LeonardoDicaprioAndOscars {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static String leo(final int oscar) {
        if (oscar > 88) {
            return "Leo got one already!";
        } else if (oscar == 88) {
            return "Leo finally won the oscar! Leo is happy";
        } else if (oscar == 86) {
            return "Not even for Wolf of wallstreet?!";
        } else {
            return "When will you give Leo an Oscar?";
        }
    }
}
