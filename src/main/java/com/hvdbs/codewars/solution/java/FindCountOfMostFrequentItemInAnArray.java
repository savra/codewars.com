package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodeInfo(
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
