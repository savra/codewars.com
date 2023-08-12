package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "You only need one - Beginner",
        url = "https://www.codewars.com/kata/57cc975ed542d3148f00015b"
)
public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (o.equals(x)) {
                return true;
            }
        }
        return false;
    }
}
