package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Function 1 - hello world",
        url = "https://www.codewars.com/kata/523b4ff7adca849afe000035"
)
public class Function1HelloWorld {
    public static String greet() {
        return "hello world!";
    }
}
