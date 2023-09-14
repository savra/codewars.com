package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Miles per gallon to kilometers per liter",
        url = "https://www.codewars.com/kata/557b5e0bddf29d861400005d"
)
public class MilesPerGallonToKilometersPerLiter {
    public static float mpgToKPM(final float mpg) {
        float tmp = (float) (1.609344 / 4.54609188);
        return (float) (Math.round(mpg * tmp * 100) / 100d);
    }
}
