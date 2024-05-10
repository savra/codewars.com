package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Reversed Words",
        url = "https://www.codewars.com/kata/51c8991dee245d7ddf00000e"
)
public class ReversedWords {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String reverseWords(String str){
        String[] tmp = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = tmp.length - 1; i >= 0; i--) {
            sb.append(tmp[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
