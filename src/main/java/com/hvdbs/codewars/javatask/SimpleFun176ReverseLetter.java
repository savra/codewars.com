package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.regex.Pattern;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Simple Fun #176: Reverse Letter",
        url = "https://www.codewars.com/kata/58b8c94b7df3f116eb00005b")
public class SimpleFun176ReverseLetter {
    public static String reverseLetter(final String str) {
        char[] tmp = Pattern.compile("[^a-z]").matcher(str).replaceAll("").toCharArray();
        String res = "";

        for (int i = 0, j = tmp.length - 1; i < j; i++, j--) {
            char t = tmp[i];
            tmp[i] = tmp[j];
            tmp[j] = t;
        }

        return new String(tmp);
    }
}
