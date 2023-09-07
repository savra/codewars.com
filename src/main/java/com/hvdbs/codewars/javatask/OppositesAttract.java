package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Opposites Attract",
        url = "https://www.codewars.com/kata/555086d53eac039a2a000083"
)
public class OppositesAttract {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static boolean isLove(final int flower1, final int flower2) {
        return !(Math.abs(flower1 - flower2) % 2 == 0);
    }
}
