package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Switch it Up!",
        url = "https://www.codewars.com/kata/5808dcb8f0ed42ae34000031")
public class SwitchItUp {
    public static String switchItUp(int number)
    {
        return switch(number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }
}
