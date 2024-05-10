package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Basic variable assignment",
        url = "https://www.codewars.com/kata/50ee6b0bdeab583673000025"
)
public class BasicVariableAssignment {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;
}
