package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Opposite number",
        url = "https://www.codewars.com/kata/56dec885c54a926dcd001095"
)
public class OppositeNumber {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int opposite(int number) {
        return -number;
    }
}
