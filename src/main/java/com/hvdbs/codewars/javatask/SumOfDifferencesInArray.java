package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(url = "https://www.codewars.com/kata/5b73fe9fb3d9776fbf00009e",
        name = "Sum of differences in array",
        difficulty = Difficulty.EIGHT)
public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        if (arr.length <= 1) return 0;

        int tmp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        if (arr.length == 2) return arr[1] - arr[0];

        int result = 0;

        for (int i = arr.length - 1; i >= 1; i--) {
            result += (arr[i] - arr[i - 1]);
        }

        return result;
    }
}
