package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Holiday VIII - Duty Free",
        url = "https://www.codewars.com/kata/57e92e91b63b6cbac20001e5")
public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {
        return (int) (hol / (normPrice * (discount / 100.0)));
    }
}
