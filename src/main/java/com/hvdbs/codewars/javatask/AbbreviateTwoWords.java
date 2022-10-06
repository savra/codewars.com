package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.stream.Collectors;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" ")).map(v -> v.substring(0, 1).toUpperCase()).collect(Collectors.joining("."));
    }
}
