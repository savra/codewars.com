package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Jenny's secret message",
        url = "https://www.codewars.com/kata/55225023e1be1ec8bc000390"
)
public class JennysSecretMessage {
    public static String greet(String name) {
        if(name.equals("Johnny")) {
            return "Hello, my love!";
        }

        return String.format("Hello, %s!", name);
    }
}
