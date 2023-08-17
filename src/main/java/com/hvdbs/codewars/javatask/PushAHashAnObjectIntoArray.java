package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodewarsInfo(
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
