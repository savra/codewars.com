package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Multiplication table for number",
        url = "https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce")
public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            stringBuilder.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }

        return stringBuilder.append(10).append(" * ").append(num).append(" = ").append(10 * num).toString();
    }
}
