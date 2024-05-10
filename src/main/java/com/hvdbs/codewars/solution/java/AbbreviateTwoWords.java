package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Abbreviate a Two Word Name",
        url = "https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3")
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" ")).map(v -> v.substring(0, 1).toUpperCase()).collect(Collectors.joining("."));
    }
}
