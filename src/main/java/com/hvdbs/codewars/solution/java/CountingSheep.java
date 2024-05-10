package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Objects;

@CodeInfo(
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
