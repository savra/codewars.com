package com.hvdbs.codewars.javatask;

import java.util.Arrays;

public class ReduceButGrow {
    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (x1, x2) -> x1 * x2);
    }
}
