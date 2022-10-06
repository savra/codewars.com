package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class ExclamationMarks6 {

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
