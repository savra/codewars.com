package com.hvdbs.codewars.javatask;

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
