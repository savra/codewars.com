package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Bubblesort Once",
        url = "https://www.codewars.com/kata/56b97b776ffcea598a0006f2"
)
public class BubblesortOnce {
    public static int[] bubbleSortOnce(int[] array) {
        int[] r = new int[array.length];

        System.arraycopy(array, 0, r, 0, array.length);

        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length - 1; j++) {
                if (r[j] > r[j + 1]) {
                    int tmp = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = tmp;
                }
            }

            break;
        }

        return r;
    }
}
