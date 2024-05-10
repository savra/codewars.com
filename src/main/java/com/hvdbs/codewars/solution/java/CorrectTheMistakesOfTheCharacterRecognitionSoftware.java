package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Correct the mistakes of the character recognition software",
        url = "https://www.codewars.com/kata/577bd026df78c19bca0002c0"
)
public class CorrectTheMistakesOfTheCharacterRecognitionSoftware {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String correct(String string) {
        char[] tmp = string.toCharArray();

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == '1') {
                tmp[i] = 'I';
            } else if (tmp[i] == '0') {
                tmp[i] = 'O';
            } else if (tmp[i] == '5') {
                tmp[i] = 'S';
            }
        }

        return new String(tmp);
    }
}
