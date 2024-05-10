package com.hvdbs.codewars.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.EIGHT,
        name = "FIXME: Static electrickery",
        url = "https://www.codewars.com/kata/596c55fc7bd5476bf60000d5")
public class FixmeStaticElectrickery {
    private static int ONE_HUNDRED = 100;

    public static final FixmeStaticElectrickery INST = new FixmeStaticElectrickery();

    private final int value;

    private FixmeStaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(FixmeStaticElectrickery.INST.plus100(23));
    }
}
