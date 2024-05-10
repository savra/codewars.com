package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "DNA to RNA Conversion",
        url = "https://www.codewars.com/kata/5556282156230d0e5e000089"
)
public class DNAToRNAConversion {
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }
}
