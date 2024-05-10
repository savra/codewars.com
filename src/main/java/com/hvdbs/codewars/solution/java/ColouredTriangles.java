package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Coloured Triangles",
        url = "https://www.codewars.com/kata/5a25ac6ac5e284cfbe000111")
public class ColouredTriangles {
    public static char triangle(final String row) {
        int n = row.length() - 1;
        int tmpN = row.length() - 1;
        char[] chars = row.toCharArray();

        while (tmpN > 0) {
            for (int i = 0; i < tmpN; i++) {
                if (chars[i] != chars[i + 1]) {
                    if (chars[i] == 'R') {
                        if (chars[i + 1] == 'G') {
                            chars[i] = 'B';
                        } else {
                            chars[i] = 'G';
                        }
                    } else if (chars[i] == 'G') {
                        if (chars[i + 1] == 'B') {
                            chars[i] = 'R';
                        } else {
                            chars[i] = 'B';
                        }
                    } else if (chars[i] == 'B') {
                        if (chars[i + 1] == 'R') {
                            chars[i] = 'G';
                        } else {
                            chars[i] = 'R';
                        }
                    }
                }
            }
            tmpN--;
        }

        return chars[0];
    }
}
