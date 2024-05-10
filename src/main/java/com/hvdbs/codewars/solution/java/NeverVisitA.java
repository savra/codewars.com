package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Never visit a . . . !?",
        url = "https://www.codewars.com/kata/56c5847f27be2c3db20009c3"
)
public class NeverVisitA {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static String subtractSum (int n) {
        int tmp = n;

        do {
            int sumDigit = 0;
            int sourceN = tmp;

            while(sourceN > 0) {
                sumDigit += sourceN % 10;
                sourceN /= 10;
            }

            tmp = tmp - sumDigit;
        } while(tmp < 1 || tmp > 100);

        return switch(tmp) {
            case 1, 3, 24, 26, 47, 49, 68, 70, 91, 93 -> "kiwi";
            case 2, 21, 23, 42, 44, 46, 65, 67, 69, 88 -> "pear";
            case 4, 6, 25, 29, 48, 50, 71, 73, 92, 94, 96 -> "banana";
            case 5, 7, 28, 30, 32, 51, 53, 74, 76, 95, 97 -> "melon";
            case 8, 10, 12, 31, 33, 52, 56, 75, 77, 79, 98, 100 -> "pineapple";
            case 9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99 -> "apple";
            default -> "cucumber";
        };
    }
}
