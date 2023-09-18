package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sleigh Authentication",
        url = "https://www.codewars.com/kata/52adc142b2651f25a8000643"
)
public class SleighAuthentication {
    public static Boolean authenticate(String name, String password){
        return "Santa Claus".equals(name) && "Ho Ho Ho!".equals(password);
    }
}
