package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sentence Smash",
        url = "https://www.codewars.com/kata/53dc23c68a0c93699800041d"
)
public class SentenceSmash {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static String smash(String... words) {
        return Arrays.stream(words).reduce("", (a, b) -> a + " " + b).trim();
    }
}
