package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Basic Mathematical Operations",
        url = "https://www.codewars.com/kata/57356c55867b9b7a60000bd7",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }
}
