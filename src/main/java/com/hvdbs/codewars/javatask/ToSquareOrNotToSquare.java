package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "ToSquareRootOrNotToSquareRoot",
        url = "https://www.codewars.com/kata/57f6ad55cca6e045d2000627")
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
