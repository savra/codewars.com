package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Common Substrings",
        url = "https://www.codewars.com/kata/5669a5113c8ebf16ed00004c"
)
public class CommonSubstrings {
    public static boolean SubstringTest(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        str1 = str1.toLowerCase();

        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length() - 2; i++) {
            if (str2.contains(str1.substring(i, i + 2))) {
                return true;
            }
        }

        return false;
    }
}
