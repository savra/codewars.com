package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Surface Area and Volume of a Box",
        url = "https://www.codewars.com/kata/565f5825379664a26b00007c"
)
public class SurfaceAreaAndVolumeOfABox {
    public static int[] getSize(int w, int h, int d) {
        return new int[] {2 * (w * h + w * d + h * d), w * h * d};
    }
}
