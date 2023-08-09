package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.IntStream;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Array plus array",
        url = "https://www.codewars.com/kata/5a2be17aee1aaefe2a000151")
public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sum();
    }
}
