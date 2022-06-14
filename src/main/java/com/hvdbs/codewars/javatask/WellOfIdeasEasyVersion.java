package com.hvdbs.codewars.javatask;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WellOfIdeasEasyVersion {
    public static String well(String[] x) {
        Map<String, Long> map = Arrays.stream(x)
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));

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
