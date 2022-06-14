package com.hvdbs.codewars.javatask;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return Arrays.stream(name.split(" ")).map(v -> v.substring(0, 1).toUpperCase()).collect(Collectors.joining("."));
    }
}
