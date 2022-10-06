package com.hvdbs.codewars.javatask;

import com.hvdbs.codewars.statgenerator.CodewarsInfo;
import com.hvdbs.codewars.statgenerator.enums.Difficulty;

@CodewarsInfo(
        difficulty = Difficulty.EIGHT,
        name = "Sort and Star",
        kataUrl = "https://www.codewars.com/kata/57cfdf34902f6ba3d300001e")
public class StaticElectrickery {
    private static int ONE_HUNDRED = 100;

    public static final StaticElectrickery INST = new StaticElectrickery();

    private final int value;

    private StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(StaticElectrickery.INST.plus100(23));
    }
}
