package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Personalized Message",
        url = "https://www.codewars.com/kata/5772da22b89313a4d50012f7"
)
public class GrasshopperPersonalizedMessage {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}
