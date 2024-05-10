package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Removing Elements",
        url = "https://www.codewars.com/kata/5769b3802ae6f8e4890009d2"
)
public class RemovingElements {
    public static Object[] removeEveryOther(Object[] arr) {
        java.util.List<Object> result = new java.util.ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result.add(arr[i]);
            }
        }

        return result.toArray();
    }
}
