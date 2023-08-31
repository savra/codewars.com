package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Do I get a bonus?",
        url = "https://www.codewars.com/kata/56f6ad906b88de513f000d96"
)
public class DoIGetABonus {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "£" + (salary * 10) : "£" + salary;
    }
}
