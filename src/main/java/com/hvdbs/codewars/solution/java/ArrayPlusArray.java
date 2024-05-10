package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.IntStream;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Array plus array",
        url = "https://www.codewars.com/kata/5a2be17aee1aaefe2a000151")
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sum();
    }
}
