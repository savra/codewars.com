package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
