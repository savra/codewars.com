package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Ghost code?!",
        url = "https://www.codewars.com/kata/570184a95594a091150000a0"
)
public class GhostCode {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static String helloName(final String name){
        if(name == null || name.equals(""))
            return "Hello world!";
        else
            return "Hello my name is " + name;
    }
}
