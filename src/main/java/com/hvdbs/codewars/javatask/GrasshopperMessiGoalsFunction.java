package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Grasshopper - Messi goals function",
        url = "https://www.codewars.com/kata/55f73be6e12baaa5900000d4"
)
public class GrasshopperMessiGoalsFunction {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        return laLigaGoals + copaDelReyGoals + championsLeagueGoals;
    }
}
