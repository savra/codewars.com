package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        return age <= 14 ? (int)Math.floor(age - 0.1 * age) + "-" + (int)Math.floor(age + 0.1 * age) : age / 2 + 7 + "-" + (age - 7) * 2;
    }

    public static void main(String[] args) {
        System.out.println(AgeRangeCompatibilityEquation.datingRange(31));
    }
}
