package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
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
