package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Get the mean of an array",
        url = "https://www.codewars.com/kata/563e320cee5dddcf77000158"
)
public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks){
        return (int) IntStream.of(marks).average().getAsDouble();
    }
}
