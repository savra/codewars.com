package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Is he gonna survive?",
        url = "https://www.codewars.com/kata/59ca8246d751df55cc00014c"
)
public class IsHeGonnaSurvive {
    public static boolean hero(int bullets, int dragons) {
        return (long)dragons * 2 <= bullets;
    }
}
