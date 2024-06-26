package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Terminal game move function",
        url = "https://www.codewars.com/kata/563a631f7cbbc236cf0000c2",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class GrasshopperTerminalGameMoveFunction {
    public static int move(int position, int roll) {
        return position + (roll * 2);
    }
}
