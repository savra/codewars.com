package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Duck Duck Goose",
        url = "https://www.codewars.com/kata/582e0e592029ea10530009ce")
public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        return String.valueOf(players[(goose % players.length) == 0 ? (players.length - 1) : (goose % players.length) - 1].name);
    }

    private static class Player {
        public String name;
    }
}
