package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SIX,
        name = "Counting Duplicates",
        url = "https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int result = 0;

        java.util.Map<Character, Integer> tmp = new java.util.HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            Character c = Character.toLowerCase(text.charAt(i));

            tmp.put(c, tmp.getOrDefault(c, 0) + 1);
        }

        for (int i : tmp.values()) {
            if (i > 1) {
                result++;
            }
        }

        return result;
    }
}
