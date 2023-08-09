package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Simple Fun #1: Seats in Theater",
        url = "https://www.codewars.com/kata/588417e576933b0ec9000045")
public class SimpleFunSeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols + 1 - col) * (nRows - row);
    }
}
