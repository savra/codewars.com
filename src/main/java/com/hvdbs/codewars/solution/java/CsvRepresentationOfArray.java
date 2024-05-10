package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.EIGHT,
        name = "CSV representation of array",
        url = "https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036")
public class CsvRepresentationOfArray {
    public static String toCsvText(int[][] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);

                if (j == array[i].length - 1) {
                    if (i != array.length - 1) {
                        sb.append("\n");
                    }
                } else {
                    sb.append(",");
                }
            }
        }

        return sb.toString();
    }
}
