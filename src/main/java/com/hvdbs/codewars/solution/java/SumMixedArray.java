package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sum Mixed Array",
        url = "https://www.codewars.com/kata/57eaeb9578748ff92a000009")
public class SumMixedArray {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(value -> value instanceof String ? Integer.parseInt((String) value) : (int) value).sum();
    }
}
