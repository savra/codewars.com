package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Playing with cubes I",
        url = "https://www.codewars.com/kata/55c0a79e20be94c91400014b"
)
public class PlayingWithCubesI {
    private int side;
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
