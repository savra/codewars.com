package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.HashMap;
import java.util.Map;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Sum of array singles",
        url = "https://www.codewars.com/kata/59f11118a5e129e591000134"
)
public class SumOfArraySingles {
    public static int repeats(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int j : arr) {
            m.put(j, m.getOrDefault(j, 0) + 1);
        }

        int res = 0;

        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() == 1) {
                res += entry.getKey();
            }
        }

        return res;
    }
}
