package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Determine offspring sex based on genes XX and XY chromosomes",
        url = "https://www.codewars.com/kata/56530b444e831334c0000020",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes {
    public static String chromosomeCheck(String sperm) {
        return sperm.equals("XX")? "Congratulations! You're going to have a daughter." : "Congratulations! You're going to have a son.";
    }
}
