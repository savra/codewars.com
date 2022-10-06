package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class SeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols + 1 - col) * (nRows - row);
    }
}
