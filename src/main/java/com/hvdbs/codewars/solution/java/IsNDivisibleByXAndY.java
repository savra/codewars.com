package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is n divisible by x and y?",
        url = "https://www.codewars.com/kata/5545f109004975ea66000086"
)
public class IsNDivisibleByXAndY {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
