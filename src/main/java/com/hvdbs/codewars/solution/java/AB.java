package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "A + B",
        url = "https://www.codewars.com/kata/5512a0b0509063e57d0003f5"
)
public class AB {
    public static byte sum (byte a, byte b) {
        byte c = (byte)(a + b);

        return c;
    }
}
