package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.math.BigDecimal;
import java.math.RoundingMode;

@CodeInfo(
        difficulty = Difficulty.SIX,
        name = "Round and Round",
        url = "https://www.codewars.com/kata/5996eb39cdc8eb39f80000a0"
)
public class RoundAndRound {
    public static double roundTo2DecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
