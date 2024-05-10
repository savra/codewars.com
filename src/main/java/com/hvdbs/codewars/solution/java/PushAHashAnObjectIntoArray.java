package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Push a hash/an object into array",
        url = "https://www.codewars.com/kata/527b3cd0492b6b15250060af"
)
public class PushAHashAnObjectIntoArray {
    public static List<String> push(){
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }
}
