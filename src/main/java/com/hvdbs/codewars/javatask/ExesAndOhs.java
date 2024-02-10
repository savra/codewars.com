package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Exes and Ohs",
        url = "https://www.codewars.com/kata/55908aad6620c066bc00002a")
public class ExesAndOhs {
    public static boolean getXO(String str) {
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                xCount++;
            }

            if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                oCount++;
            }
        }

        return xCount == oCount;
    }
}
