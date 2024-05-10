package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Calculate BMI",
        url = "https://www.codewars.com/kata/57a429e253ba3381850000fb",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)"
)
public class CalculateBmi {
    public static String bmi(double weight, double height) {
        double bmi = weight / (height * height);

        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25) {
            return "Normal";
        } else if (bmi <= 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
