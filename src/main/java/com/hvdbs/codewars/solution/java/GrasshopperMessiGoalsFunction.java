package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Messi goals function",
        url = "https://www.codewars.com/kata/55f73be6e12baaa5900000d4",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class GrasshopperMessiGoalsFunction {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
