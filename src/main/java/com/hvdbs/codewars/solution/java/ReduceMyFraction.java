package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Reduce My Fraction",
        url = "https://www.codewars.com/kata/576400f2f716ca816d001614")
public class ReduceMyFraction {
    public static int[] myFraction(int[] fractions) {
        int gc = gcd(fractions[0], fractions[1]);

        return new int[]{fractions[0] / gc, fractions[1] / gc};
    }

    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }

        return gcd(q, p % q);
    }
}
