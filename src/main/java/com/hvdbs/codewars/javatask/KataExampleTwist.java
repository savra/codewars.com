package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Kata Example Twist",
        url = "https://www.codewars.com/kata/525c1a07bb6dda6944000031"
)
public class KataExampleTwist {
    public static String[] kataExampleTwist() {
        String[] websites = new String[1000];

        for (int i = 0; i < 1000; i++) {
            websites[i] = "codewars";
        }

        return websites;
    }
}
