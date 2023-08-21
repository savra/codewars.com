package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Calculate BMI",
        url = "https://www.codewars.com/kata/57a429e253ba3381850000fb"
)
public class CalculateBmi {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
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
