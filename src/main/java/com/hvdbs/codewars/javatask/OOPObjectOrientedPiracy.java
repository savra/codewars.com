package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "OOP: Object Oriented Piracy",
        url = "https://www.codewars.com/kata/54fe05c4762e2e3047000add"
)
public class OOPObjectOrientedPiracy {
    private final double draft;
    private final int crew;

    public OOPObjectOrientedPiracy(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        return draft - (crew * 1.5) > 20;
    }
}
