package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "How good are you really?",
        url = "https://www.codewars.com/kata/5601409514fc93442500010b"
)
public class HowGoodAreYouReally {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return (Arrays.stream(classPoints).reduce(0, Integer::sum) + yourPoints) / (classPoints.length + 1) < yourPoints;
    }
}
