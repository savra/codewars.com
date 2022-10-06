package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class TotalPoints {
    public static int points(String[] games) {
        int totalPoint = 0;
        int firstTeamResult, secondTeamResult;

        for (String game : games) {
            firstTeamResult = game.charAt(0);
            secondTeamResult = game.charAt(2);

            if (firstTeamResult > secondTeamResult) {
                totalPoint += 3;
            } else if (firstTeamResult == secondTeamResult) {
                totalPoint++;
            }
        }

        return totalPoint;
    }
}
