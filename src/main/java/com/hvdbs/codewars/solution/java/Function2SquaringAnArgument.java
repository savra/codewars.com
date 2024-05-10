package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Function 2 - squaring an argument",
        url = "https://www.codewars.com/kata/523b623152af8a30c6000027"
)
public class Function2SquaringAnArgument {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int square(int n){
        return n * n;
    }
}
