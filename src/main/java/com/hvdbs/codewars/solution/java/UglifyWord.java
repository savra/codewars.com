package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Uglify Word",
        url = "https://www.codewars.com/kata/5ce6cf94cb83dc0020da1929")
public class UglifyWord {
    public static String uglifyWord(String str) {
        boolean flag = true;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= (int) 'a' && chars[i] <= (int) 'z') || (chars[i] >= (int) 'A' && chars[i] <= (int) 'Z')) {
                if ((chars[i] >= (int) 'a' && chars[i] <= (int) 'z') && flag) {
                    chars[i] = (char) (chars[i] - 32);
                } else if (chars[i] >= (int) 'A' && chars[i] <= (int) 'Z' && !flag) {
                    chars[i] = (char) (chars[i] + 32);
                }
                flag = !flag;
            } else {
                flag = true;
            }
        }

        return new String(chars);
    }
}
