package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "DNA to RNA Conversion",
        url = "https://www.codewars.com/kata/5556282156230d0e5e000089"
)
public class DNAToRNAConversion {
    public String dnaToRna(String dna) {
        return dna.replace("T", "U");
    }
}
