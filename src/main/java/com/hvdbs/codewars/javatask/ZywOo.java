package com.hvdbs.codewars.javatask;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        if (arr.length <= 1) return 0;

        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        int result = 0;

        for (int i = arr.length - 1; i >= 1; i--) {
            result += (arr[i] - arr[i - 1]);
        }

        return result;
    }
}