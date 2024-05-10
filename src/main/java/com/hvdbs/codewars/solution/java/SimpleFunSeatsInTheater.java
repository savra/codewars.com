package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Simple Fun #1: Seats in Theater",
        url = "https://www.codewars.com/kata/588417e576933b0ec9000045")
public class SimpleFunSeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols + 1 - col) * (nRows - row);
    }
}
