package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
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
