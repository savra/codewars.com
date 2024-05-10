package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Triple Trouble",
        url = "https://www.codewars.com/kata/5704aea738428f4d30000914"
)
public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }

        return sb.toString();
    }
}
