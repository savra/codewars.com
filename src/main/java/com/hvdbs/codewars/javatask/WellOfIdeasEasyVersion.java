package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Well of Ideas - Easy Version",
        url = "https://www.codewars.com/kata/57f222ce69e09c3630000212")
public class WellOfIdeasEasyVersion {
    public static String well(String[] x) {
        Map<String, Long> map = Arrays.stream(x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (!map.containsKey("good")) {
            return "Fail!";
        } else {
            if (map.get("good") <= 2) {
                return "Publish!";
            } else {
                return "I smell a series!";
            }
        }
    }
}
