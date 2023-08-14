package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Objects;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Counting sheep...",
        url = "https://www.codewars.com/kata/54edbc7200b811e956000556"
)
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) java.util.Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(v -> v)
                .count();
    }
}
