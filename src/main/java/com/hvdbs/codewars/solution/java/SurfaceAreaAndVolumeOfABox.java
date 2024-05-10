package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Surface Area and Volume of a Box",
        url = "https://www.codewars.com/kata/565f5825379664a26b00007c",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class SurfaceAreaAndVolumeOfABox {
    public static int[] getSize(int w, int h, int d) {
        return new int[] {2 * (w * h + w * d + h * d), w * h * d};
    }
}
