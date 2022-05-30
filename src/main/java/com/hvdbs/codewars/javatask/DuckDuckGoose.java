package com.hvdbs.codewars.javatask;

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        return String.valueOf(players[(goose % players.length) == 0 ? (players.length - 1) : (goose % players.length) - 1].name);
    }
}
