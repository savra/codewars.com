package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Debug sayHello",
        url = "https://www.codewars.com/kata/5625618b1fe21ab49f00001f"
)
public class GrasshopperDebugSayHello {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static String sayHello(String name) {
        return "Hello, " + name;
    }
}
