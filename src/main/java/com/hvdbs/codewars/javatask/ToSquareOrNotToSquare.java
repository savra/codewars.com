package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class ToSquareOrNotToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array).map(item -> {
            double sqrt = Math.sqrt(item);

            if (sqrt > 0 && Math.round(sqrt) == sqrt) {
                return (int) sqrt;
            } else {
                return (int) Math.pow(item, 2);
            }
        }).toArray();
    }
}
