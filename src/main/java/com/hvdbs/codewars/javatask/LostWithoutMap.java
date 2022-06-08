package com.hvdbs.codewars.javatask;

import java.util.Arrays;

public class LostWithoutMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(value -> value << 1).toArray();

    }
}
