package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Debug",
        url = "https://www.codewars.com/kata/55cb854deb36f11f130000e1"
)
public class GrasshopperDebug {
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);

        return (c <= 0) ? c + " is freezing temperature" : c + " is above freezing temperature";
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * (5 / 9.0);
    }
}
