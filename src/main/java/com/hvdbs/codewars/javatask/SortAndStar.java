package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Optional;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        url = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class SortAndStar {
    public static String twoSort(String[] s) {
        Optional<String> first = Arrays.stream(s).sorted().findFirst();
        if (first.isPresent()) {
            char[] chars = first.get().toCharArray();

            StringBuilder stringBuilder = new StringBuilder();

            for (char aChar : chars) stringBuilder.append(aChar).append("***");

            return stringBuilder.subSequence(0, stringBuilder.length() - 3).toString();
        }

        return null;
    }
}
