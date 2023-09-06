package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Beginner Series #1 School Paperwork",
        url = "https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd"
)
public class BeginnerSeries1SchoolPaperwork {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public static int paperWork(int n, int m)
    {
        if (n < 0 || m < 0) {
            return 0;
        }

        return n * m;
    }
}
