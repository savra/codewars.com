package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Printing Array elements with Comma delimiters",
        url = "https://www.codewars.com/kata/56e2f59fb2ed128081001328"
)
public class PrintingArrayElementsWithCommaDelimiters {
    public static String printArray(Object array[]) {
        return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }
}
