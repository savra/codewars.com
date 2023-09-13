package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Basic variable assignment",
        url = "https://www.codewars.com/kata/50ee6b0bdeab583673000025"
)
public class BasicVariableAssignment {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a + b;
}
