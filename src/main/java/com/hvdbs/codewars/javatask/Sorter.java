package com.hvdbs.codewars.javatask;

import java.util.List;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
