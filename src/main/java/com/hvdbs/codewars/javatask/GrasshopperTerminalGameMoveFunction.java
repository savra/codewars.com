package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Terminal game move function",
        url = "https://www.codewars.com/kata/563a631f7cbbc236cf0000c2"
)
public class GrasshopperTerminalGameMoveFunction {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int move(int position, int roll) {
        return position + (roll * 2);
    }
}
