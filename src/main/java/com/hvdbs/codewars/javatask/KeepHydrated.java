package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Keep Hydrated!",
        url = "https://www.codewars.com/kata/582cb0224e56e068d800003c")
public class KeepHydrated {
    public int Liters(double time)  {
        return (int)Math.floor(time * 0.5);
    }
}
