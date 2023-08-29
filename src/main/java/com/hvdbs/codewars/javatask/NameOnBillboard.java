package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Name on billboard",
        url = "https://www.codewars.com/kata/570e8ec4127ad143660001fd"
)
public class NameOnBillboard {
    public static int billboard(String name, int price) {
        int result = 0;

        for (int i = 0; i < name.length(); i++) {
            result += price;
        }

        return result;
    }
}
