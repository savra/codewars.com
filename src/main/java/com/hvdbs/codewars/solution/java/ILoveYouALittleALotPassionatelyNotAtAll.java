package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "I love you, a little , a lot, passionately ... not at all",
        url = "https://www.codewars.com/kata/57f24e6a18e9fad8eb000296")
public class ILoveYouALittleALotPassionatelyNotAtAll {
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
