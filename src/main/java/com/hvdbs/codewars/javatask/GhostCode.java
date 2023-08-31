package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
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
