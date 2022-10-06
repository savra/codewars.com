package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        return String.valueOf(players[(goose % players.length) == 0 ? (players.length - 1) : (goose % players.length) - 1].name);
    }

    private static class Player {
        public String name;
    }
}
