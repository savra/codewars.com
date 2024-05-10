package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@CodeInfo(
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
