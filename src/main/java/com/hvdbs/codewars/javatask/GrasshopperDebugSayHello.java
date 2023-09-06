package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
