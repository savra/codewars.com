package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner Series #4 Cockroach",
        url = "https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class BeginnerSeriesCockroach {
    public int cockroachSpeed(double x) {
        return x == 0 ? 0 : (int) (x / 3.6 * 100);
    }
}
