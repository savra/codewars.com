package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Holiday VIII - Duty Free",
        url = "https://www.codewars.com/kata/57e92e91b63b6cbac20001e5")
public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / (normPrice * (discount / 100.0)));
    }
}
