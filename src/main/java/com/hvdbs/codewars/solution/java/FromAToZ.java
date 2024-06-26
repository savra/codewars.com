package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "From A to Z",
        url = "https://www.codewars.com/kata/6512b3775bf8500baea77663"
)
public class FromAToZ {
    public static String gimmeTheLetters(String s) {
        StringBuilder sb = new StringBuilder();

        int start = s.charAt(0);
        int end = s.charAt(s.length() - 1);

        for (int i = start; i <= end; i++) {
            sb.append((char) i);
        }

        return sb.toString();
    }
}
