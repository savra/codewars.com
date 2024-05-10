package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Age Range Compatibility Equation",
        url = "https://www.codewars.com/kata/5803956ddb07c5c74200144e")
public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return age <= 14 ? (int)Math.floor(age - 0.1 * age) + "-" + (int)Math.floor(age + 0.1 * age) : age / 2 + 7 + "-" + (age - 7) * 2;
    }
}
