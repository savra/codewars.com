package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Collatz Conjecture (3n+1)",
        url = "https://www.codewars.com/kata/577a6e90d48e51c55e000217"
)
public class CollatzConjecture3n1 {
    public static int hotpo(int n) {
        int res = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            res++;
        }

        return res;
    }
}
