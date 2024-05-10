package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "MakeUpperCase",
        url = "https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class MakeUpperCase {
    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
}
