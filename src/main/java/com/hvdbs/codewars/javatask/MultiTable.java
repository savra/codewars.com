package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class MultiTable {
    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            stringBuilder.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }

        return stringBuilder.append(10).append(" * ").append(num).append(" = ").append(10 * num).toString();
    }

    public static void main(String[] args) {
        multiTable(5);
    }
}
