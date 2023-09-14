package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

import java.math.BigDecimal;
import java.math.RoundingMode;

@CodewarsInfo(
        difficulty = Difficulty.SIX,
        name = "Round and Round",
        url = "https://www.codewars.com/kata/5996eb39cdc8eb39f80000a0"
)
public class RoundAndRound {
    public static double roundTo2DecimalPlaces(double number) {
        return BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
