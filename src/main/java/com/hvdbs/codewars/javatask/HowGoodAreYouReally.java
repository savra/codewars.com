package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Arrays;

@CodewarsInfo(
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
