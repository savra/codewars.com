package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Calculate average",
        url = "https://www.codewars.com/kata/57a2013acf1fa5bfc4000921"
)
public class CalculateAverage {
    public static double find_average(int[] array){
        return IntStream.of(array).average().getAsDouble();
    }
}
