package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Determine offspring sex based on genes XX and XY chromosomes",
        url = "https://www.codewars.com/kata/56530b444e831334c0000020"
)
public class DetermineOffspringSexBasedOnGenesXXAndXYChromosomes {
    public static String chromosomeCheck(String sperm) {
        //My Time Complexity: O(1)
        //My Space complexity: O(1)
        return sperm.equals("XX")? "Congratulations! You're going to have a daughter." : "Congratulations! You're going to have a son.";
    }
}
