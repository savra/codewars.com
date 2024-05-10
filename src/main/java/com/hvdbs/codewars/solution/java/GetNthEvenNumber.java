package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Get Nth Even Number",
        url = "https://www.codewars.com/kata/5933a1f8552bc2750a0000ed")
public class GetNthEvenNumber {
    public static int nthEven(int n) {
        return (n << 1) - 2;
    }
}
