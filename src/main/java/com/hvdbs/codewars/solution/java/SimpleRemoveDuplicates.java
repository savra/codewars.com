package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Simple remove duplicates",
        url = "https://www.codewars.com/kata/5ba38ba180824a86850000f7")
public class SimpleRemoveDuplicates {
    public static int[] solve(int[] arr) {
        List<Integer> res = new ArrayList<>();

        for (int j = arr.length - 1; j >= 0; j--) {
            if (!res.contains(arr[j])) {
                res.add(0, arr[j]);
            }
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
