package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
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
