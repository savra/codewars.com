package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Shortest Word",
        url = "https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class ShortestWord {
    public static int findShort(String s) {
        int min = 0x7fffffff;
        int curMin = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                min = Math.min(curMin, min);
                curMin = 0;
            } else {
                curMin++;
            }
        }

        return Math.min(curMin, min);
    }
}
