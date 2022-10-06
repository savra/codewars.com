package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.List;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(value -> value instanceof String ? Integer.parseInt((String) value) : (int) value).sum();
    }
}
