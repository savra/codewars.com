package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SEVEN,
        name = "Square Every Digit",
        url = "https://www.codewars.com/kata/546e2562b03326a88e000020"
)
public class SquareEveryDigit {
    //My Time Complexity: O(logN)
    //My Space complexity: O(logN)
    public int squareDigits(int n) {
        if (n <= 0) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            sb.insert(0, (int)Math.pow(n % 10, 2));

            n /= 10;
        }

        return Integer.parseInt(sb.toString());
    }
}
