package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "altERnaTIng cAsE <=> ALTerNAtiNG CaSe",
        url = "https://www.codewars.com/kata/56efc695740d30f963000557"
)
public class AltERnaTIngCAsEALTerNAtiNGCaSe {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (currentChar >= 'A' && currentChar <= 'Z') {
                sb.append((char)(currentChar + 32));
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                sb.append((char)(currentChar - 32));
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
