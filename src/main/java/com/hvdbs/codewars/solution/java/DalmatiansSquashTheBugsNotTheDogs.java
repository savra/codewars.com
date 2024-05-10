package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "101 Dalmatians - squash the bugs, not the dogs!",
        url = "https://www.codewars.com/kata/56f6919a6b88de18ff000b36"
)
public class DalmatiansSquashTheBugsNotTheDogs {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static String howManyDalmatians(int number) {
        String[] dogs = new String[]{"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};

        return number <= 10 ? dogs[0] : number <= 50 ? dogs[1] : number == 101 ? dogs[3] : dogs[2];
    }
}
