package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Shortest Word",
        url = "https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9")
public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(-1);
    }
}
