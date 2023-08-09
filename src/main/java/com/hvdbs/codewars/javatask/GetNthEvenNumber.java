package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Get Nth Even Number",
        url = "https://www.codewars.com/kata/5933a1f8552bc2750a0000ed")
public class GetNthEvenNumber {
    public static int nthEven(int n) {
        return (n << 1) - 2;
    }
}
