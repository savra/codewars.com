package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Calculate average",
        url = "https://www.codewars.com/kata/57a2013acf1fa5bfc4000921"
)
public class CalculateAverage {
    public static double find_average(int[] array){
        return IntStream.of(array).average().getAsDouble();
    }
}
