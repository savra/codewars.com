package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Transportation on vacation",
        url = "https://www.codewars.com/kata/568d0dd208ee69389d000016"
)
public class TransportationOnVacation {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int rentalCarCost(int d) {
        if (d >= 7) {
            return d * 40 - 50;
        } else if (d >= 3) {
            return d * 40 - 20;
        } else {
            return d * 40;
        }
    }
}
