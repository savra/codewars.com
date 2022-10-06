package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] petals = {
                "I love you",
                "a little",
                "a lot",
                "passionately",
                "madly",
                "not at all"
        };

        return petals[nb_petals % petals.length == 0 ? petals.length - 1 : (nb_petals % petals.length) - 1];
    }
}
