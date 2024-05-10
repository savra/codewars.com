package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Get the mean of an array",
        url = "https://www.codewars.com/kata/563e320cee5dddcf77000158"
)
public class GetTheMeanOfAnArray {
    public static int getAverage(int[] marks){
        return (int) IntStream.of(marks).average().getAsDouble();
    }
}
