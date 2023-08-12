package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Convert number to reversed array of digits",
        url = "https://www.codewars.com/kata/5583090cbe83f4fd8c000051"
)
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        if (n == 0) {
            return new int[] {0};
        }

        int[] result = new int[(int)Math.log10(n) + 1];

        String tmp = String.valueOf(n);

        for (int i = tmp.length() - 1, j = 0; i >= 0; i--, j++) {
            result[j] = Character.getNumericValue(tmp.charAt(i));
        }

        return result;
    }
}
