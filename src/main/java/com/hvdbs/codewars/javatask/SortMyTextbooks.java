package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.List;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort My Textbooks",
        url = "https://www.codewars.com/kata/5a07e5b7ffe75fd049000051")
public class SortMyTextbooks {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
