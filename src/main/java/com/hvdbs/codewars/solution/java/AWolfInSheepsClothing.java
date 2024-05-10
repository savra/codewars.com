package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "A wolf in sheep's clothing",
        url = ""
)
public class AWolfInSheepsClothing {
    public static String warnTheSheep(String[] array) {
        for (int i = array.length - 1, j = 1; i >= 0; i--, j++) {
            if ("wolf".equals(array[i])) {
                return "Pls go away and stop eating my sheep";
            } else {
                if ("wolf".equals(array[i - 1])) {
                    return "Oi! Sheep number " + j + "! You are about to be eaten by a wolf!";
                }
            }
        }

        return "";
    }
}
