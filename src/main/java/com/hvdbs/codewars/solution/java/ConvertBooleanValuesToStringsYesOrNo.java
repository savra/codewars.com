package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert boolean values to strings 'Yes' or 'No'.",
        url = "https://www.codewars.com/kata/53369039d7ab3ac506000467"
)
public class ConvertBooleanValuesToStringsYesOrNo {
    public static String boolToWord(boolean b){
        return b ? "Yes" : "No";
    }
}
