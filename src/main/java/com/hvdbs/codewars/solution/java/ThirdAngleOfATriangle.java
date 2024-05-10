package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Third Angle of a Triangle",
        url = "https://www.codewars.com/kata/5a023c426975981341000014")
public class ThirdAngleOfATriangle {
    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}
