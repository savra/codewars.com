package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Nickname Generator",
        url = "https://www.codewars.com/kata/593b1909e68ff627c9000186"
)
public class NicknameGenerator {
    public static String nickname(String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }

        return "aeiou".contains(String.valueOf(name.charAt(2))) ? name.substring(0, 4) : name.substring(0, 3);
    }
}
