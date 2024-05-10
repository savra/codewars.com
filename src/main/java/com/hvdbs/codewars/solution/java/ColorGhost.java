package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Random;

@CodeInfo(
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
