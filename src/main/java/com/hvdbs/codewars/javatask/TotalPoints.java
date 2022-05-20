package com.hvdbs.codewars.javatask;

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
