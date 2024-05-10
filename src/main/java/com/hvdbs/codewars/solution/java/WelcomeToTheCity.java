package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Welcome to the City",
        url = "https://www.codewars.com/kata/5302d846be2a9189af0001e4"
)
public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
    }
}
