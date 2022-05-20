package com.hvdbs.codewars.javatask;

public class SeatsInTheater {
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols + 1 - col) * (nRows - row);
    }
}
