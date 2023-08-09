package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.List;

@CodewarsInfo(
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
