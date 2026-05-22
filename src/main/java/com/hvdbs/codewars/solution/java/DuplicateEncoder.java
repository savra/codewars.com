package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SIX,
        name = "Duplicate Encoder",
        url = "https://www.codewars.com/kata/54b42f9314d9229fd6000d9c",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class DuplicateEncoder {
    static String encode(String word) {
        java.util.Map<Character, Integer> m = new java.util.HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));

            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if (m.get(c) == 1) {
                sb.append("(");
            } else {
                sb.append(")");
            }
        }

        return sb.toString();
    }
}
