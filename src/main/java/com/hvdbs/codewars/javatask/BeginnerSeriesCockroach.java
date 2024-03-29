package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner Series #4 Cockroach",
        url = "https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6"
)
public class BeginnerSeriesCockroach {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public int cockroachSpeed(double x){
        return x == 0 ? 0 : (int)(x / 3.6 * 100);
    }
}
