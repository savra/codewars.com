package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodewarsInfo(
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
