package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is he gonna survive?",
        url = "https://www.codewars.com/kata/59ca8246d751df55cc00014c"
)
public class IsHeGonnaSurvive {
    public static boolean hero(int bullets, int dragons) {
        return (long)dragons * 2 <= bullets;
    }
}
