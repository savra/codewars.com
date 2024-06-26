package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "Pythagorean Triple",
        url = "https://www.codewars.com/kata/5951d30ce99cf2467e000013")
public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple) {
        int result = 0;

        int maxValue = triple[0];

        if (triple[1] > maxValue) {
            maxValue = triple[1];

            if (triple[2] > maxValue) {
                maxValue = triple[2];

                if (maxValue * maxValue == triple[1] * triple[1] + triple[0] * triple[0]) {
                    result = 1;
                }
            } else {
                if (maxValue * maxValue == triple[2] * triple[2] + triple[0] * triple[0]) {
                    result = 1;
                }
            }
        } else {
            if (triple[2] > maxValue) {
                maxValue = triple[2];

                if (maxValue * maxValue == triple[1] * triple[1] + triple[0] * triple[0]) {
                    result = 1;
                }
            } else {
                if (maxValue * maxValue == triple[1] * triple[1] + triple[2] * triple[2]) {
                    result = 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
         int[] p1={3,4,5};
         int[] p2={3,5,7};

        PythagoreanTriple pT = new PythagoreanTriple();
        pT.pythagoreanTriple(p1);
    }
}
