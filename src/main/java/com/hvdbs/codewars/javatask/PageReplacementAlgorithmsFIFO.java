package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Page replacement algorithms: FIFO",
        url = "https://www.codewars.com/kata/62d34faad32b8c002a17d6d9")
public class PageReplacementAlgorithmsFIFO {
    public static int[] fifo(int n, int[] referenceList) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        int j = 0;
        int k = 0;

        boolean isPresent = false;

        for (int item : referenceList) {
            for (int value : result) {
                if (value == item) {
                    isPresent = true;
                    break;
                }
            }

            if (isPresent) {
                isPresent = false;
                continue;
            }

            if (j < n) {
                result[j] = item;
                j++;
            } else {
                if (k >= n) {
                    k = 0;
                }

                result[k++] = item;
            }
        }

        return result;
    }
}
