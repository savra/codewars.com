package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Thinkful - Number Drills: Blue and red marbles",
        url = "https://www.codewars.com/kata/5862f663b4e9d6f12b00003b")
public class ThinkfulNumberDrillsBlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double)(blueStart - bluePulled) / ((redStart - redPulled) + (blueStart - bluePulled));
    }
}
