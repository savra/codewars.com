package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Closing in Sum",
        url = "https://www.codewars.com/kata/65126d52a5de2b11c94096d2")
public class ClosingInSum {
    public static int closingInSum(long n) {
        int[] tmp = new int[(int) Math.log10(n) + 1];

        int i = 0;

        int sum = 0;

        while (n > 0) {
            tmp[i++] = (int) (n % 10);
            n /= 10;
        }

        for (int j = 0, k = tmp.length - 1; j < k; j++, k--) {
            sum += Integer.parseInt("" + tmp[k] + tmp[j]);
        }

        if (tmp.length % 2 != 0) {
            sum += tmp[tmp.length / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        closingInSum(1039L);
    }
}


