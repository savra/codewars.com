package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "What is between?",
        url = "https://www.codewars.com/kata/55ecd718f46fba02e5000029"
)
public class WhatIsBetween {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static int[] between(int a, int b) {
        List<Integer> res = new ArrayList<>();

        for (int i = a, j = 0; i <= b; i++, j++) {
            res.add(i);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
