package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

@CodeInfo(url = "https://www.codewars.com/kata/5b077ebdaf15be5c7f000077",
        name = "If you can't sleep, just count sheep!!",
        difficulty = Difficulty.EIGHT)
public class IfYouCantSleepJustCountSheep {
    public static String countingSheep(int num) {
        return Stream.iterate(1, (n) -> n + 1).limit(num).map(n -> n + " sheep...").collect(joining());
    }
}
