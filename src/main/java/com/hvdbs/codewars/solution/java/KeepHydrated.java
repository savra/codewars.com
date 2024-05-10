package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Keep Hydrated!",
        url = "https://www.codewars.com/kata/582cb0224e56e068d800003c")
public class KeepHydrated {
    public int Liters(double time)  {
        return (int)Math.floor(time * 0.5);
    }
}
