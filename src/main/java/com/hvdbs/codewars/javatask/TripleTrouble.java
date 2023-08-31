package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Triple Trouble",
        url = "https://www.codewars.com/kata/5704aea738428f4d30000914"
)
public class TripleTrouble {
    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < one.length(); i++) {
            sb.append(one.charAt(i)).append(two.charAt(i)).append(three.charAt(i));
        }

        return sb.toString();
    }
}
