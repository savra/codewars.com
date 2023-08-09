package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Will there be enough space?",
        url = "https://www.codewars.com/kata/5875b200d520904a04000003")
public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        int result = cap - on - wait;

        return result >= 0 ? 0 : Math.abs(result);
    }
}
