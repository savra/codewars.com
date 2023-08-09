package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Multiple of index",
        url = "https://www.codewars.com/kata/5a34b80155519e1a00000009")
public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        return IntStream.range(1, array.length)
                .filter(index -> array[index] % index == 0)
                .map(index -> array[index])
                .toArray();
    }
}
