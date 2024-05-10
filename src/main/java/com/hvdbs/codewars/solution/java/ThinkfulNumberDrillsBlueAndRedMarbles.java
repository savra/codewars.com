package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Thinkful - Number Drills: Blue and red marbles",
        url = "https://www.codewars.com/kata/5862f663b4e9d6f12b00003b")
public class ThinkfulNumberDrillsBlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double)(blueStart - bluePulled) / ((redStart - redPulled) + (blueStart - bluePulled));
    }
}
