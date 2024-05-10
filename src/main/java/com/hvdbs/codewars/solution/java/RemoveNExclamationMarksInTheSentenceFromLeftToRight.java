package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Exclamation marks series #6: Remove n exclamation marks in the sentence from left to right",
        url = "https://www.codewars.com/kata/57faf7275c991027af000679")
public class RemoveNExclamationMarksInTheSentenceFromLeftToRight {

    public static String remove(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = n; i < s.length(); i++) {
            if (s.charAt(i) != '!' || j <= 0) {
                result.append(s.charAt(i));
            } else {
                j--;
            }
        }

        return result.toString();
    }
}
