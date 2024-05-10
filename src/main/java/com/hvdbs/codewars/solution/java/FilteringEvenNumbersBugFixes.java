package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Filtering even numbers (Bug Fixes)",
        url = "https://www.codewars.com/kata/566dc566f6ea9a14b500007b"
)
public class FilteringEvenNumbersBugFixes {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        listOfNumbers.removeIf(currentValue -> currentValue % 2 == 0);

        return listOfNumbers;
    }
}
