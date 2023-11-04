package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Find Count of Most Frequent Item in an Array",
        url = "https://www.codewars.com/kata/56582133c932d8239900002e")
public class FindCountOfMostFrequentItemInAnArray {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection == null || collection.length == 0) {
            return 0;
        }

        Map<Integer, Integer> m = new HashMap<>();

        int max = 0x80000000;

        for (int item : collection) {
            m.put(item, m.getOrDefault(item, 0) + 1);

            if (m.get(item) > max) {
                max = m.get(item);
            }
        }

        return max;
    }
}
