package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Area or Perimeter",
        url = "https://www.codewars.com/kata/5ab6538b379d20ad880000ab")
public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * l : (l << 1) + (w << 1);
    }
}
