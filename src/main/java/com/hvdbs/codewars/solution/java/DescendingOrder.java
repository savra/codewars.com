package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SEVEN,
        name = "Descending Order",
        url = "https://www.codewars.com/kata/5467e4d82edf8bbf40000155")
public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num == 0) {
            return 0;
        }

        java.util.List<Integer> digits = new java.util.ArrayList<>();
        int tmp = num;

        while (tmp > 0) {
            digits.add(tmp % 10);
            tmp /= 10;
        }

        digits.sort(java.util.Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();

        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }

        return Integer.parseInt(sb.toString());
    }
}
