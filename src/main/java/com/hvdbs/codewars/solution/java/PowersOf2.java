package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Powers of 2",
        url = "https://www.codewars.com/kata/57a083a57cb1f31db7000028"
)
public class PowersOf2 {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static long[] powersOfTwo(int n){
        long[] result = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            result[i] = 1L << i;
        }

        return result;
    }
}
