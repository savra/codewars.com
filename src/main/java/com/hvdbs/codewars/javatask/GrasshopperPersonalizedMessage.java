package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
