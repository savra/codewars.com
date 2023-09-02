package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.List;

@CodewarsInfo(
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
