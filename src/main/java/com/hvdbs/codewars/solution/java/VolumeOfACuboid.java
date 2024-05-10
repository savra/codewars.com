package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Volume of a Cuboid",
        url = "https://www.codewars.com/kata/58261acb22be6e2ed800003a")
public class VolumeOfACuboid {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
