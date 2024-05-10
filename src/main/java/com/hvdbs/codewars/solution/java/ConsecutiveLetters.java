package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Consecutive letters",
        url = "https://www.codewars.com/kata/5ce6728c939bf80029988b57"
)
public class ConsecutiveLetters {
    public static boolean solve(String s) {
        if (s.length() == 1) {
            return true;
        }

        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        for (int i = 0; i < chars.length - 1; i++) {
            if ((int) chars[i + 1] - (int) chars[i] != 1) {
                return false;
            }
        }

        return true;
    }
}
