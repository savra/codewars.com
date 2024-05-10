package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.stream.IntStream;

@CodeInfo(
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
