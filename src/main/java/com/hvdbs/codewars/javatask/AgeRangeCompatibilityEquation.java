package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Age Range Compatibility Equation",
        url = "https://www.codewars.com/kata/5803956ddb07c5c74200144e")
public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return age <= 14 ? (int)Math.floor(age - 0.1 * age) + "-" + (int)Math.floor(age + 0.1 * age) : age / 2 + 7 + "-" + (age - 7) * 2;
    }
}
