package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        return IntStream.range(1, array.length)
                .filter(index -> array[index] % index == 0)
                .map(index -> array[index])
                .toArray();
    }
}
