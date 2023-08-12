package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Merging sorted integer arrays (without duplicates)",
        url = "https://www.codewars.com/kata/573f5c61e7752709df0005d2"
)
public class MergingSortedIntegerArraysWithoutDuplicates {
    public static int[] mergeArrays(int[] first, int[] second) {
        return Stream.concat(Arrays.stream(first).boxed(), Arrays.stream(second).boxed())
                .collect(Collectors.toSet())
                .stream()
                .mapToInt(value -> value)
                .sorted()
                .toArray();
    }
}
