package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "MakeUpperCase",
        url = "https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7"
)
public class MakeUpperCase {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
}
