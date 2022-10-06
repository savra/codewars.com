package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        int result = cap - on - wait;

        return result >= 0 ? 0 : Math.abs(result);
    }
}
