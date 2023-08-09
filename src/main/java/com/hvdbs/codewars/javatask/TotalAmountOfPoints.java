package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Total amount of points",
        url = "https://www.codewars.com/kata/5bb904724c47249b10000131")
public class TotalAmountOfPoints {
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
