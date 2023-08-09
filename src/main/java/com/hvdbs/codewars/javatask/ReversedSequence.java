package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Reversed sequence",
        url = "https://www.codewars.com/kata/5a00e05cc374cb34d100000d")
public class ReversedSequence {
    public static int[] reverse(int n){
        int[] result = new int[n];
        for(int i = n, j = 0; i >= 1; i--, j++) {
            result[j] = i;
        }

        return  result;
    }
}
