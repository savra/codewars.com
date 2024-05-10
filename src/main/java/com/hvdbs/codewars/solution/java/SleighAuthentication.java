package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sleigh Authentication",
        url = "https://www.codewars.com/kata/52adc142b2651f25a8000643"
)
public class SleighAuthentication {
    public static Boolean authenticate(String name, String password){
        return "Santa Claus".equals(name) && "Ho Ho Ho!".equals(password);
    }
}
