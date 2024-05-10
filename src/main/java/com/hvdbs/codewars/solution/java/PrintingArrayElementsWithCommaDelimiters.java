package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Printing Array elements with Comma delimiters",
        url = "https://www.codewars.com/kata/56e2f59fb2ed128081001328"
)
public class PrintingArrayElementsWithCommaDelimiters {
    public static String printArray(Object array[]) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
