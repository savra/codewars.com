package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Area or Perimeter",
        url = "https://www.codewars.com/kata/5ab6538b379d20ad880000ab")
public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * l : (l << 1) + (w << 1);
    }
}
