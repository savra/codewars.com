package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Isograms",
        url = "https://www.codewars.com/kata/54ba84be607a92aa900000f1")
public class Isograms {
    public static boolean isIsogram(String str) {
        return str.toUpperCase().chars().boxed().collect(java.util.stream.Collectors.toSet()).size() == str.length();
    }
}
