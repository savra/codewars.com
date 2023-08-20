package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Bin to Decimal",
        url = "https://www.codewars.com/kata/57a5c31ce298a7e6b7000334"
)
public class BinToDecimal {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }
}
