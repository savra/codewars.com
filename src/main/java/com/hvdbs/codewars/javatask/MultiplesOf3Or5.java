package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.SIX,
        name = "Multiples of 3 or 5",
        url = "https://www.codewars.com/kata/514b92a657cdc65150000006"
)
public class MultiplesOf3Or5 {
    //TC: O(LogN), SC: O(1)
    public int solution(int n) {
        int sum = 0;

        int tmpN = n - 1;

        while (tmpN > 2) {
            int rest = tmpN % 10;

            if (rest == 0 || rest == 5) {
                sum += tmpN;
                tmpN--;
                continue;
            }

            int tmp = tmpN;
            int subSum = 0;

            while (tmp > 0) {
                subSum += tmp % 10;
                tmp /= 10;
            }

            if (subSum % 3 == 0) {
                sum += tmpN;
            }

            tmpN--;
        }

        return sum;
    }
}
