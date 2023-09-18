package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.Random;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Color Ghost",
        url = "https://www.codewars.com/kata/53f1015fa9fe02cbda00111a"
)
public class ColorGhost {
    public String getColor() {
        String[] colors = new String[] {"white", "yellow", "purple", "red"};

        Random r = new Random();

        return colors[r.nextInt(4)];
    }
}
