package com.hvdbs.codewars;

import java.util.Arrays;

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
