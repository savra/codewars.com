package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Get Planet Name By ID",
        url = "https://www.codewars.com/kata/515e188a311df01cba000003"
)
public class GetPlanetNameByID {
    static String getPlanetName(int id) {
        return switch (id) {
            case 1 -> "Mercury";
            case 2 -> "Venus";
            case 3 -> "Earth";
            case 4 -> "Mars";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptune";
            default -> throw new IllegalStateException("Unexpected value: " + id);
        };
    }
}
