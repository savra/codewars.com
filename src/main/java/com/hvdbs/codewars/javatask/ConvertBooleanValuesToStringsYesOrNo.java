package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert boolean values to strings 'Yes' or 'No'.",
        url = "https://www.codewars.com/kata/53369039d7ab3ac506000467"
)
public class ConvertBooleanValuesToStringsYesOrNo {
    public static String boolToWord(boolean b){
        return b ? "Yes" : "No";
    }
}
